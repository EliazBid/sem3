package processSale.view;

import processSale.controller.Controller;

public class View {

	private Controller contr;

	public View(Controller contr) {
		this.contr = contr;
	}

	public void runProgram(){
		contr.startSale();
		System.out.println("New sale started!");
	}
}
