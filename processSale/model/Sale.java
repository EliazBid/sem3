package processSale.model;

import java.util.ArrayList;
import java.time.LocalTime;
import processSale.integration.ItemDTO;
import processSale.model.CashPayment;
import processSale.integration.Printer;

public class Sale {

	private LocalTime saleTime;

	private Amount runningTotal;

	private Amount change;

	private ArrayList<ItemDTO> itemList;

	private Receipt receipt;

	private CashPayment moneyPaid;

	
	/**
	 * Creates a new instance of a sale. The time of the sale is set to the current time. A new receipt is created.
	 */
	public Sale() {
		setTimeOfSale();
		receipt = new Receipt();
	}
	/**
	 * Sets the time of the sale to the current time.
	 */
	private void setTimeOfSale() {
		saleTime = LocalTime.now();
	}
	/**
	 * Adds an item to the sale. If the item is already in the sale, the quantity is increased by one.
	 * @param itemDTO	The item to be added to the sale.
	 */
	public void addItem(ItemDTO itemDTO) {
		checkIfDuplicates(itemDTO);
		itemList.add(0, itemDTO);
	}

	public void addItem(int quantity, ItemDTO itemDTO) {

	}

	/**
	 * Returns the running total of the sale.
	 * 
	 */
	public Amount getRunningTotal() {
		return runningTotal;
	}

	public LocalTime getTimeOfSale() {
		return saleTime;
	}

	public Amount getChange() {
		return null;
	}

	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}
	
	public Amount applyDiscountToRunningTotal(Discount discount) {
		return null;
	}

	private void checkIfDuplicates(ItemDTO ItemDTO) {
		if (itemList.contains(ItemDTO)) {
			int index = itemList.indexOf(ItemDTO);
			itemList.get(index).increaseQuantity();
		}
	}

	public void pay(CashPayment toPay, Sale sale) {
		this.moneyPaid = toPay;
		toPay.calculateTotalCost(sale,moneyPaid);
		
	}

	public Receipt getReceipt(Sale sale, Printer printer) {
		Receipt finalReceipt = new Receipt(sale);
		printer.printReceipt(finalReceipt);
		return finalReceipt;
	}

}
