package processSale.model;

import processSale.integration.ItemDTO;

public class Receipt {

	private int timeOfSale;

	private ItemDTO itemList;

	private Amount runningTotal;

	private Amount change;

	public Receipt() {

	}

	public void addToReceipt(Sale sale) {

	}

}
