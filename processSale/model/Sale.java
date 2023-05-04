package processSale.model;

import java.util.ArrayList;
import java.time.LocalTime;
import processSale.integration.ItemDTO;
import processSale.model.CashPayment;
import processSale.integration.Printer;

public class Sale {

	private LocalTime saleTime;

	private Amount runningTotal = new Amount(0);

	private Amount change;

	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

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
		if (!itemList.contains(itemDTO)){
			itemList.add(0, itemDTO);
			runningTotal.add(itemDTO.getPrice());
		}
	}

	/**
	 * Adds an item and its quantity to the sale. Used in the case of multiple items of the same type. 
	 * Never actually used in the program since alternative flow 3-4c is not to be implemented.
	 * @param quantity the multiple of the item
	 * @param itemDTO  the item to be added
	 */
	public void addItem(int quantity, ItemDTO itemDTO) {

	}

	/**
	 * Returns the running total of the sale.
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
	/**
	 * Calls method to calculate total cost and saves the cashpayment.
	 * @param toPay money given by customer
	 * @param sale current sale
	 */
	public void pay(CashPayment toPay, Sale sale) {
		toPay.calculateTotalCost(sale);
	}
	/**
	 * Creates a finalized receipt, prints it, and returns the receipt.
	 * @param sale current sale reference
	 * @param printer printer reference
	 * @return The finalalized receipt
	 */
	public Receipt getReceipt(Sale sale, Printer printer) {
		Receipt finalReceipt = new Receipt(sale);
		printer.printReceipt(finalReceipt);
		return finalReceipt;
	}

}
