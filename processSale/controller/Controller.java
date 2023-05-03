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

	private Amount change;
	
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
	/**
	 * Handles money given by customer to calculate total cost and change, updates external systems and cash register, and prints a finalized receipt.
	 * @param paidAmount Money given by customer
	 */
	public void enterAmountPaid(Amount paidAmount) {
		
		CashPayment toPay = new CashPayment(paidAmount);
		sale.pay(toPay,sale);
		updateExternals();
		cashRegister.addMoney(toPay);
		receipt = sale.getReceipt(sale,printer);
		change = sale.getChange();
	}
	/**
	 * Updates external systems
	 */
	public void updateExternals(){
		externalAccountingSystem.updateAccountingSystem();
		externalInventorySystem.updateInventory();
	}

}
