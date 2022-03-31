import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class Kata1Test {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", Kata1.greet("Ryan"));
    }
}
