package processSale.model;

import processSale.java.time.LocalTime;
import processSale.integration.ItemDTO;

public class Sale {

	private java.time.LocalTime saleTime;

	private Amount runningTotal;

	private Amount change;

	private ItemDTO itemList;

	private Receipt receipt;

	public Sale Sale() {
		return null;
	}

	private void setTimeOfSale() {

	}

	public void addItem(ItemDTO itemDTO) {

	}

	public void addItem(int quantity, ItemDTO itemDTO) {

	}

	public Amount getRunningTotal() {
		return null;
	}

	public Amount getChange() {
		return null;
	}

	public ItemDTO getItemList() {
		return null;
	}

	public Amount applyDiscountToRunningTotal(Discount discount) {
		return null;
	}

	private void checkIfDuplicates() {

	}

	public void pay(CashPayment toPay) {

	}

	public Receipt getReceipt() {
		return null;
	}

}
