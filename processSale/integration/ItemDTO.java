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
		this.itemIdentifier = itemIdentifier;
		this.quantity = quantity;
		this.price = price;
		this.name = name;
		this.vatRate = vatRate;
	}

	/**
	 * Increases the quantity of the item.
	 */
	public void increaseQuantity() {
		quantity++;
	}

	public int getIdentifier() {
		return this.itemIdentifier;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public Amount getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}

	public Amount getFinalPrice() {
		Amount quan = new Amount(quantity);
		Amount priceOfItems = new Amount(price.getAmount());
		priceOfItems.multiply(quan);
		return priceOfItems;
	}

}
