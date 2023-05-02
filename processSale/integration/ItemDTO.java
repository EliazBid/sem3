package processSale.integration;

import processSale.model.Amount;

public class ItemDTO {

	private int itemIdentifier;

	private int quantity;

	private Amount price;

	private String name;

	private boolean validIdentifier;

	private int vatRate;

	public ItemDTO ItemDTO(int itemIdentifier, int quantity, Amount price, String name, boolean validIdentifier) {
		return null;
	}

	public int getIdentifier() {
		return 0;
	}

	public int getQuantity() {
		return 0;
	}

	public Amount getPrice() {
		return null;
	}

	public String getName() {
		return null;
	}

	public boolean isIdentifierValid() {
		return false;
	}

}
