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
		contr.scanItem(1); // 1 is the item identifier
		contr.scanItem(4); // 4 is the item identifier
		contr.scanItem(2); // 2 is the item identifier
		contr.scanItem(3); // 3 is the item identifier
		contr.scanItem(4); // 4 is the item identifier
		contr.endSale(); 
		contr.enterAmountPaid(amount); 
	}
}
