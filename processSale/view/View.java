package processSale.view;

import processSale.controller.Controller;
import processSale.model.Amount;

public class View {

	private Controller contr;
	private Amount amount = new Amount(100.0);

	public View(Controller contr) {
		this.contr = contr;
	}

	public void runProgram(){
		contr.startSale();
		System.out.println("New sale started!");
		contr.scanItem(5);
		contr.endSale();
		contr.enterAmountPaid(amount);
	}
}
