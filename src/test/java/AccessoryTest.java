import org.junit.Before;
import org.junit.Test;

public class AccessoryTest {
    Accessory accessory;
    Accessory accessory2;

    @Before
    public void before(){
        accessory = new Accessory("0.25 guage plectrum pack", 1, 2);
        accessory2 = new Accessory("Mad World sheet music", 2, 4);
    }

    @Test

    assertEquals(2, accessory2.markUp());
}
