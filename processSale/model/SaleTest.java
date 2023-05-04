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

    @Test
    public void Testadditem() {
        ItemDTO itemDTO = new ItemDTO(2, 1, new Amount(20), "Bread", "A loaf of bread", 1.06);
        ItemDTO itemDTO2 = new ItemDTO(2, 2, new Amount(20), "Bread", "A loaf of bread", 1.06);
        itemLists2.add(itemDTO);
        itemLists2.add(itemDTO);
        System.out.println(itemLists);
        assertTrue("something wrong",itemLists.contains(itemDTO2));
    }

    @Test
    public void getReceipt() {
    }
}