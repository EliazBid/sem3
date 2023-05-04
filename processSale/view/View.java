package processSale.view;

import processSale.controller.Controller;
import processSale.model.Amount;

public class View {

	private Controller contr;
	private Amount amount = new Amount(160); // 100 is the amount paid by the customer

	public View(Controller contr) {
		this.contr = contr;
	}

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
