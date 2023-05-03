package processSale.model;

public class CashPayment {

	private Amount amount;

	public CashPayment (Amount PaidAmount) {
		this.amount = PaidAmount;
	}

	public Amount calculateTotalCost(Sale paidSale, CashPayment moneyPaid) {
		return null;
	}

}
