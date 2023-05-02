package processSale.model;

import processSale.integration.ItemDTO;

public class Receipt {

	private int timeOfSale;

	private ItemDTO itemList;

	private Amount runningTotal;

	private int change;

	public Receipt Receipt() {
		return null;
	}

	public void addToReceipt(Sale sale) {

	}

}
