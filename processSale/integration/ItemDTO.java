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
	 * @param description The description of the item.
	 * @param vatRate The vat rate of the item.
	 */
	public ItemDTO(int itemIdentifier, int quantity, Amount price, String name, String description, int vatRate) {
		
	}

	/**
	 * Increases the quantity of the item.
	 */
	public void increaseQuantity() {
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
