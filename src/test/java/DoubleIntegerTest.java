import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;
public class DoubleIntegerTest {
    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, DoubleInteger.doubleInteger(2)); // Test cases here!
    }

}
