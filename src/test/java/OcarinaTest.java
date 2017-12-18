import Instruments.Ocarina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OcarinaTest {

    Ocarina ocarina;

    @Before
    public void before(){
        ocarina = new Ocarina(5, 7, 15, "woodwind", "wood");
    }

    @Test
    public void canGetNumHoles(){
        assertEquals(5, ocarina.getNumHoles());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(7, ocarina.getBuyPrice());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15,ocarina.getSellPrice());
    }

    @Test
    public void canPlay(){
        assertEquals("I make a peep", ocarina.play("peep"));
    }




}
