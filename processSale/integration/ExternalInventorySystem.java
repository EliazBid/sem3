package processSale.integration;

import processSale.model.Amount;
import java.util.ArrayList;

public class ExternalInventorySystem {

	private ArrayList<ItemDTO> inventory;

	public ExternalInventorySystem() {
		this.inventory = createInventory();
	}

	/**
	 * Finds an item in the inventory.
	 * @param itemIdentifier The identifier of the item.
	 */
	public ItemDTO findItem(int itemIdentifier) {
		for (ItemDTO item : inventory) {
			if (item.getIdentifier() == itemIdentifier) {
				return item;
			}
		}
		return null;
	}



	public void updateInventory() {

	}

	/**
	 * Creates a list of items to be used as inventory.
	 */
	private ArrayList<ItemDTO> createInventory() {
		ArrayList<ItemDTO> inventory = new ArrayList<ItemDTO>();
		inventory.add(new ItemDTO(1, 1, new Amount(10), "Milk", "A carton of milk", 1.12));
		inventory.add(new ItemDTO(2, 1, new Amount(20), "Bread", "A loaf of bread", 1.06));
		inventory.add(new ItemDTO(3, 1, new Amount(30), "Butter", "A pack of butter", 1.06));
		inventory.add(new ItemDTO(4, 1, new Amount(40), "Cheese", "A block of cheese", 1.12));
		inventory.add(new ItemDTO(5, 1, new Amount(50), "Ham", "A pack of ham", 1.25));
		inventory.add(new ItemDTO(6, 1, new Amount(60), "Eggs", "A dozen eggs", 1.12));
		inventory.add(new ItemDTO(7, 1, new Amount(70), "Flour", "A bag of flour", 1.25));
		inventory.add(new ItemDTO(8, 1, new Amount(80), "Sugar", "A bag of sugar", 1.12));
		inventory.add(new ItemDTO(9, 1, new Amount(90), "Salt", "A bag of salt", 1.06));
		inventory.add(new ItemDTO(10, 1, new Amount(100), "Pepper", "A bag of pepper", 1.25));
		return inventory;
	}
	
	
	



	
}
