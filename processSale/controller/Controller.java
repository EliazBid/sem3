package processSale.controller;

import processSale.model.Sale;
import processSale.integration.ExternalAccountingSystem;
import processSale.integration.DiscountDataBase;
import processSale.integration.ExternalInventorySystem;
import processSale.model.CashRegister;
import processSale.model.Receipt;
import processSale.model.CashPayment;
import processSale.integration.Printer;
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

	public Controller Controller() {
		return null;
	}

	public void startSale() {

	}

	public void scanItem() {

	}

	public void enterQuantity() {

	}

	public void endSale() {

	}

	public void discountRequest(int socialSecurityNumber) {

	}

	public void enterAmountPaid(Amount paidAmount) {

	}

}
