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

	private RegistryCreator creator;
	
	/**
     	* Creates an instance of the controller where the references to externals systems are saved.
	* @param creator The creator of the external systems.
     	* @param printer The printer that will print the receipt.
     	*/
   	public Controller(RegistryCreator creator, Printer printer) {
        	this.externalAccountingSystem = creator.getExternalAccountingSystem();
		this.externalInventorySystem = creator.getExternalInventorySystem();
		this.discountDataBase = creator.getDiscountDataBase();
       		this.cashRegister = new CashRegister();
        	this.printer = printer;
    	}

	public void startSale() {
		sale = new Sale();
	}

	//look in external inventory system for matching itemidentifier, if found, add ItemDTO to sale
	public void scanItem(int itemIdentifier) {	
		ItemDTO foundItem = externalInventorySystem.findItem(itemIdentifier);
		sale.addItem(foundItem);
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
