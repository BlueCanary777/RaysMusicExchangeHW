import Instruments.Guitar;
import Instruments.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop("Ryan's Music Exchange");
        guitar = new Guitar("Gibson Les Paul Studio", 6, 175, 350);
    }

    @Test
    public void checkStockZero(){
        assertEquals(0, shop.countItemsInStock());
    }

    @Test
    public void addItemTest(){
        shop.addItem(guitar);
        assertEquals(1, shop.countItemsInStock());
    }
}
