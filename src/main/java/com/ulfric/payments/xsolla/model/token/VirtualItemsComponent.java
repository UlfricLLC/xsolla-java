package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class VirtualItemsComponent extends Component {

	@SerializedName("selected_group")
	private String selectedGroup;
	@SerializedName("selected_item")
	private String selectedItem;

	public String getSelectedGroup() {
		return selectedGroup;
	}

	public void setSelectedGroup(String selectedGroup) {
		this.selectedGroup = selectedGroup;
	}

	public String getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(String selectedItem) {
		this.selectedItem = selectedItem;
	}

}
