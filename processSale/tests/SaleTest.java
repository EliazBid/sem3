package processSale.tests;

import org.junit.Test;
import java.util.ArrayList;
import processSale.integration.ItemDTO;
import processSale.model.Amount;
import processSale.model.Sale;

import static org.junit.Assert.*;

public class SaleTest {


    @Test
    public void addItemTest() {

        Sale sale = new Sale();

        ItemDTO itemDTO = new ItemDTO(2, 1, new Amount(20), "Bread", "A loaf of bread", 1.06);
        ItemDTO anotherItemDTO = new ItemDTO(2, 2, new Amount(20), "Bread", "A loaf of bread", 1.06);
        
        
        sale.addItem(itemDTO);
        assertEquals("wrong number of item(s) added", sale.getItemList().size(), 1);
        assertEquals("item added to wrong index",sale.getItemList().get(0), itemDTO);
        assertEquals("quantity of item 1 incorrect", sale.getItemList().get(0).getQuantity(), 1);
        
        
        sale.addItem(itemDTO);
        assertEquals("itemList size increased instead of quantity", sale.getItemList().size(), 1);
        assertEquals("quantity of item 1 incorrect", sale.getItemList().get(0).getQuantity(), 2);
        
        
        sale.addItem(anotherItemDTO);
        assertEquals("item added successfully",sale.getItemList().size(),2);
        assertEquals("item added in wrong index",sale.getItemList().get(0), anotherItemDTO);
        assertEquals("item added in wrong index",sale.getItemList().get(1), itemDTO);
        assertEquals("quantity of item 2 incorrect", sale.getItemList().get(0).getQuantity(), 2);
        assertEquals("quantity of item 1 incorrect", sale.getItemList().get(1).getQuantity(), 2);
        
        
        sale.addItem(itemDTO);
        assertEquals("itemList size increased instead of quantity", sale.getItemList().size(), 2);
        assertEquals("quantity of item 1 incorrect", sale.getItemList().get(1).getQuantity(), 3);
    }
}