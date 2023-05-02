package processSale.model;

import java.time.LocalTime;
import processSale.integration.ItemDTO;

public class Sale {

	private LocalTime saleTime;

	private Amount runningTotal;

	private Amount change;

	private ItemDTO itemList;

	private Receipt receipt;

	public Sale() {
		setTimeOfSale();
	}

	private void setTimeOfSale() {
		saleTime = LocalTime.now();
		receipt = new Receipt();
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
