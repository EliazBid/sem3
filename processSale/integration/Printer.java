package processSale.integration;

import processSale.model.Receipt;

public class Printer {

	/**
     	* Creates an instance of the printer.
     	*/
    	public Printer() {
        
    	}

    	/**
     	* Prints the receipt.
	*
     	* @param receipt The receipt to be printed.
     	*/

	public void printReceipt(Receipt receipt) {
		System.out.println("The runningtotal is: " + receipt.getRunningTotal());
		System.out.println("The change is: " + receipt.getChange());
	}

}
