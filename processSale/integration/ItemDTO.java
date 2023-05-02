package processSale.integration;

import processSale.model.Amount;

public class ItemDTO {

	private int itemIdentifier;

	private int quantity;

	private Amount price;

	private String name;

	private boolean validIdentifier;

	private int vatRate;

	/**
	 * Creates an instance of an item.
	 * @param itemIdentifier The identifier of the item.
	 * @param quantity The quantity of the item.
	 * @param price The price of the item.
	 * @param name The name of the item.
	 * @param validIdentifier True if the identifier is valid, false if not.
	 */
	public ItemDTO(int itemIdentifier, int quantity, Amount price, String name, boolean validIdentifier) {
		
	}

	/**
	 * Increases the quantity of the item.
	 */
	public void increasteQuantity() {
		quantity++;
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
