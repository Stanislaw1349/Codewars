import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class CubeTest {
    @Test
    public void testSetToThree() {
        Cube c = new Cube();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }
}
