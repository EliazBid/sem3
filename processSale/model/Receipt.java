package processSale.model;

import java.time.LocalTime;

import processSale.integration.ItemDTO;
import java.util.ArrayList;

public class Receipt {

	private LocalTime timeOfSale;

	private ArrayList<ItemDTO> itemList;

	private Amount runningTotal;

	private Amount change;

	public Receipt() {
		/**
		 * Constructor that makes a receipt with the given sale information.
		 */
	}
	public Receipt(Sale sale) {
		this.timeOfSale = sale.getTimeOfSale();
		this.itemList = sale.getItemList();
		this.runningTotal = sale.getRunningTotal();
		this.change = sale.getChange();
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
