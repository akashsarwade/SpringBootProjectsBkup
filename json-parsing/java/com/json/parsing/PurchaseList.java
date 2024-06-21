package com.json.parsing;

import java.util.List;

public class PurchaseList {

	private final List<PurchaseItem> items;

	public PurchaseList(List<PurchaseItem> items) {
		this.items = items;
	}

	public List<PurchaseItem> getItems() {
		return items;
	}

}
