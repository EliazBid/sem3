package processSale.integration;

public class RegistryCreator {
	
	private ExternalAccountingSystem externalAccountingSystem;

    	private ExternalInventorySystem externalInventorySystem;

    	private DiscountDataBase discountDataBase;
    
	/**
	 * Creates an instance of the registry creator.
	*/
	public RegistryCreator() {
		this.externalAccountingSystem = new ExternalAccountingSystem();
		this.externalInventorySystem = new ExternalInventorySystem();
		this.discountDataBase = new DiscountDataBase();
	}
    
	/** 
	 * Returns the external accounting system.
	 */
	public ExternalAccountingSystem getExternalAccountingSystem() {
		return this.externalAccountingSystem;
	}

	/** 
	 * Returns the external inventory system.
	 */
	public ExternalInventorySystem getExternalInventorySystem() {
		return this.externalInventorySystem;
	}

	/** 
	 * Returns the discount database.
	 */
	public DiscountDataBase getDiscountDataBase() {
		return this.discountDataBase;
	}

}
