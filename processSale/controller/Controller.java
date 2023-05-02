package processSale.controller;

import processSale.model.Sale;
import processSale.integration.ExternalAccountingSystem;
import processSale.integration.DiscountDataBase;
import processSale.integration.ExternalInventorySystem;
import processSale.model.CashRegister;
import processSale.model.Receipt;
import processSale.model.CashPayment;
import processSale.integration.Printer;
import processSale.integration.RegistryCreator;
import processSale.integration.ItemDTO;
import processSale.model.Discount;
import processSale.model.Amount;

public class Controller {

	private Sale sale;

	private ExternalAccountingSystem externalAccountingSystem;

	private DiscountDataBase discountDataBase;

	private ExternalInventorySystem externalInventorySystem;

	private CashRegister cashRegister;

	private Receipt receipt;

	private CashPayment cashPayment;

	private Printer printer;

	private Discount discount;

	RegistryCreator creator;

	public Controller(RegistryCreator creator, Printer printer) {
		this.creator = creator;
		this.printer = printer;
	}

	public void startSale() {
		sale = new Sale();
	}

	public void scanItem(ItemDTO searchedItem) {
		if (searchedItem != null) {
			sale.addItem(searchedItem);
		}
	}


	/**
	 * Ends the sale. The total price is calculated and returned.
	 */
	public void endSale() {
		Amount runningTotal = sale.getRunningTotal();
		System.out.println("The total price is: " + runningTotal);
	}

	public void enterAmountPaid(Amount paidAmount) {

	}

}
