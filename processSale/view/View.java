package processSale.view;

import processSale.controller.Controller;
import processSale.model.Amount;

public class View {

	private Controller contr;
	private Amount amount = new Amount(100000000); // amount is the money given by the customer

	/**
	 * Creates a new instance.
	 * @param contr The controller that is used for all operations.
	 */
	public View(Controller contr) {
		this.contr = contr;
	}

	/**
	 * Simulates a user input that generates calls to all system operations.
	 * scanItem() is called 5 times to simulate 5 items being scanned.
	 * Numbers 1-10 are used to simulate item identifiers.
	 */
	public void runProgram(){
		contr.startSale();
		System.out.println("New sale started!\n");
		contr.scanItem(1); 
		contr.scanItem(4); 
		contr.scanItem(2); 
		contr.scanItem(3); 
		contr.scanItem(4); 
		contr.endSale(); 
		contr.enterAmountPaid(amount); 
	}
}
