import Instruments.Guitar;
import org.junit.Before;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson Les Paul Studio", 6, 175, 350);
    }
}
