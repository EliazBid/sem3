package processSale.model;

import processSale.integration.ItemDTO;

public class Receipt {

	private int timeOfSale;

	private ItemDTO itemList;

	private Amount runningTotal;

	private Amount change;

	public Receipt() {

	}

	/**
	 * Adds the sale information to the receipt.
	 * @param sale The sale that is to be added to the receipt.
	 */
	public void addToReceipt(Sale sale) {
		this.itemList = sale.getItemList();
		this.runningTotal = sale.getRunningTotal();
		this.change = sale.getChange();
	}

}
