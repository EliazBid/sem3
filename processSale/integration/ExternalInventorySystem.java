package processSale.integration;

import processSale.model.Amount;
import java.util.ArrayList;

public class ExternalInventorySystem {

	public ExternalInventorySystem() {
		ArrayList<ItemDTO> inventory = createInventory();
	}

	public ItemDTO findItem(ItemDTO searchedItem) {
		return null;
	}

	public void updateInventory() {

	}

	/**
	 * Creates a list of items to be used as inventory.
	 */
	private ArrayList<ItemDTO> createInventory() {
		ArrayList<ItemDTO> inventory = new ArrayList<ItemDTO>();
		inventory.add(new ItemDTO(1, 1, new Amount(10), "Milk", "A carton of milk", 12));
		inventory.add(new ItemDTO(2, 1, new Amount(20), "Bread", "A loaf of bread", 12));
		inventory.add(new ItemDTO(3, 1, new Amount(30), "Butter", "A pack of butter", 12));
		inventory.add(new ItemDTO(4, 1, new Amount(40), "Cheese", "A block of cheese", 12));
		inventory.add(new ItemDTO(5, 1, new Amount(50), "Ham", "A pack of ham", 12));
		inventory.add(new ItemDTO(6, 1, new Amount(60), "Eggs", "A dozen eggs", 12));
		inventory.add(new ItemDTO(7, 1, new Amount(70), "Flour", "A bag of flour", 12));
		inventory.add(new ItemDTO(8, 1, new Amount(80), "Sugar", "A bag of sugar", 12));
		inventory.add(new ItemDTO(9, 1, new Amount(90), "Salt", "A bag of salt", 12));
		inventory.add(new ItemDTO(10, 1, new Amount(100), "Pepper", "A bag of pepper", 12));
		return inventory;
	}
	
	
	



	
}
