package processSale.model;

import org.junit.Test;
import java.util.ArrayList;
import processSale.integration.ItemDTO;
import static org.junit.Assert.*;

public class SaleTest {

    private ArrayList<ItemDTO> itemLists = new ArrayList<ItemDTO>();
    private ArrayList<ItemDTO> itemLists2 = new ArrayList<ItemDTO>();

    @Test
    public void addItemTest() {
        ItemDTO itemDTO = new ItemDTO(1, 1, new Amount(10), "Milk", "A carton of milk", 1.12);
        itemLists.add(itemDTO);
        assertTrue(itemLists.contains(itemDTO));
    }

    /** 
    @Test
    public void Testadditem() {
        ArrayList<ItemDTO> itemLists2 = new ArrayList<ItemDTO>();
        ItemDTO itemDTO = new ItemDTO(2, 1, new Amount(20), "Bread", "A loaf of bread", 1.06);
        ItemDTO itemDTO2 = new ItemDTO(2, 2, new Amount(20), "Bread", "A loaf of bread", 1.06);
        itemLists2.add(itemDTO);
        itemLists2.add(itemDTO);
        System.out.println(itemLists);
        assertTrue("something wrong", itemLists2.contains(itemDTO2));
    }
    */

    @Test
    public void testaddItem() {

        Sale sale = new Sale();

        ItemDTO itemDTO1 = new ItemDTO(2, 1, new Amount(20), "Bread", "A loaf of bread", 1.06);
        ItemDTO itemDTO2 = new ItemDTO(2, 2, new Amount(20), "Bread", "A loaf of bread", 1.06);
        
        // Test adding a new item to an empty list
        sale.addItem(itemDTO1);
        assertEquals(sale.getItemList().size(), 1);
        assertEquals(sale.getItemList().get(0), itemDTO1);
        
        // Test adding a duplicate item
        sale.addItem(itemDTO1);
        assertEquals(1,sale.getItemList().size());
        
        // Test adding a different item to the list
        sale.addItem(itemDTO2);
        assertEquals(2,sale.getItemList().size());
        assertEquals(sale.getItemList().get(0), itemDTO2);
        assertEquals(sale.getItemList().get(1), itemDTO1);
        
        // Test adding the same item to the list again
        sale.addItem(itemDTO1);
        assertEquals(sale.getItemList().size(), 2);
    }

    @Test
    public void getReceipt() {
    }
}