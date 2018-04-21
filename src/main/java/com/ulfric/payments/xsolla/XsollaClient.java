package com.ulfric.payments.xsolla;

import java.util.Collections;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ulfric.payments.xsolla.model.subscription.list.SubscriptionListRequest;
import com.ulfric.payments.xsolla.model.subscription.list.SubscriptionListResponse;
import com.ulfric.payments.xsolla.model.token.TokenCreateRequest;
import com.ulfric.payments.xsolla.model.token.TokenCreateResponse;
import com.ulfric.payments.xsolla.model.tokenization.list.ListSavedPaymentAccountsRequest;
import com.ulfric.payments.xsolla.model.tokenization.list.ListSavedPaymentAccountsResponse;
import com.ulfric.payments.xsolla.model.wallet.users.list.UserListRequest;
import com.ulfric.payments.xsolla.model.wallet.users.list.UserListResponse;

import okhttp3.ConnectionSpec;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.TlsVersion;

public class XsollaClient {

	private static final MediaType JSON = MediaType.parse("application/json");

	public static class Builder {
		private OkHttpClient okHttp;
		private String version;
		private Gson gson;
		private String merchantId;
		private String secret;

		public XsollaClient build() {
			return new XsollaClient(this);
		}

		public Builder okHttp(OkHttpClient okHttp) {
			this.okHttp = okHttp;
			return this;
		}

		public Builder version(String version) {
			this.version = version;
			return this;
		}

		public Builder gson(Gson gson) {
			this.gson = gson;
			return this;
		}

		public Builder merchantId(String merchantId) {
			this.merchantId = merchantId;
			return this;
		}

		public Builder secret(String secret) {
			this.secret = secret;
			return this;
		}
	}

	private final OkHttpClient okHttp;
	private final Gson gson;
	private final String version;
	private final String merchantId;

	private XsollaClient(Builder builder) {
		OkHttpClient okHttp = builder.okHttp == null ? createFreshClient() : builder.okHttp;
		if (builder.merchantId != null || builder.secret != null) {
			okHttp = okHttp.newBuilder().authenticator(new BasicAuthenticator(builder.merchantId, builder.secret)).build();
		}
		this.merchantId = builder.merchantId == null ? "0" : builder.merchantId;
		this.okHttp = okHttp;
		this.version = builder.version == null ? "v2" : builder.version;
		this.gson = builder.gson == null ? new Gson() : builder.gson;
	}

	private OkHttpClient createFreshClient() {
		ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
				.tlsVersions(TlsVersion.TLS_1_2)
				.build();
		return new OkHttpClient.Builder().connectionSpecs(Collections.singletonList(spec)).build();
	}

	public TokenCreateResponse createToken(TokenCreateRequest request) {
		Parameters parameters = new Parameters();
		parameters.put("merchant_id", merchantId);
		return post(request, "merchants/${merchant_id}/token", parameters, TokenCreateResponse.class);
	}

	public ListSavedPaymentAccountsResponse listSavedPaymentAccounts(ListSavedPaymentAccountsRequest request) {
		return get(request, "projects/${project_id}/users/${user_id}/payment_accounts", ListSavedPaymentAccountsResponse.class);
	}

	public SubscriptionListResponse listSubscriptions(SubscriptionListRequest request) {
		return get(request, "projects/${project_id}/subscriptions/payments", SubscriptionListResponse.class);
	}

	public UserListResponse listUsers(UserListRequest request) {
		return get(request, "projects/${project_id}/users", UserListResponse.class);
	}

	public <T extends com.ulfric.payments.xsolla.model.Response> T get(com.ulfric.payments.xsolla.model.Request request, String endpoint, Class<T> responseType) {
		HttpUrl url = url(endpoint, requestToParameters(request));

		Request okRequest = new Request.Builder().get().url(url).build();

		return call(okRequest, responseType);
	}

	public <T extends com.ulfric.payments.xsolla.model.Response> T post(com.ulfric.payments.xsolla.model.Request request,
			String endpoint, Parameters parameters, Class<T> responseType) {
		HttpUrl url = url(endpoint, parameters);

		Request okRequest = new Request.Builder()
				.post(RequestBody.create(JSON, gson.toJson(request)))
				.addHeader("Content-Type", "application/json")
				.addHeader("Accept", "application/json")
				.url(url)
				.build();

		return call(okRequest, responseType);
	}

	private Parameters requestToParameters(com.ulfric.payments.xsolla.model.Request request) {
		if (request == null) {
			return null;
		}

		return gson.fromJson(gson.toJson(request), Parameters.class);
	}

	private HttpUrl url(String endpoint, Parameters parameters) {
		endpoint = endpoint.startsWith("/") ? endpoint.substring(1) : endpoint;

		HttpUrl.Builder builder = new HttpUrl.Builder()
			.scheme("https")
			.host("api.xsolla.com")
			.addPathSegment("merchant")
			.addPathSegment(version);

		if (parameters != null) {
			for (Map.Entry<String, String> parameter : parameters.entrySet()) {
				String key = String.format("${%s}", parameter.getKey());
				if (endpoint.contains(key)) {
					endpoint = endpoint.replace(key, parameter.getValue());
				} else {
					builder = builder.addQueryParameter(parameter.getKey(), parameter.getValue());
				}
			}
		}

		builder = builder.addPathSegments(endpoint);
		return builder.build();
	}

	private <T extends com.ulfric.payments.xsolla.model.Response> T call(Request request, Class<T> responseType) {
		String responseBody = null;
		try {
			Response response = okHttp.newCall(request).execute();
			responseBody = response.body().string();
			JsonElement responseJson = gson.fromJson(responseBody, JsonElement.class);
			if (responseJson.isJsonArray()) {
				JsonObject newResponseJson = new JsonObject();
				newResponseJson.add("array", responseJson);
				responseJson = newResponseJson;
			}
			T responseObject = gson.fromJson(responseJson, responseType);
			if (responseObject.getHttpStatusCode() == null) {
				responseObject.setHttpStatusCode(response.code());
			}
			return responseObject;
		} catch (Exception exception) {
			throw new XsollaRuntimeException("Response body: " + responseBody, exception);
		}
	}

}
