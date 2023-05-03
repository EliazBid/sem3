package processSale.model;

public class CashPayment {

	private Amount amount;
	
	/**
	 * creates instance with given amount
	 * @param PaidAmount money given by customer
	 */
	public CashPayment (Amount PaidAmount) {
		this.amount = PaidAmount;
	}
	/**
	 * calculates total cost of the sale
	 * @param paidSale 
	 * @param moneyPaid
	 * @return
	 */
	public Amount calculateTotalCost(Sale paidSale, CashPayment moneyPaid) {
		return null;
	}

}
