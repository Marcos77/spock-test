package junit;

import com.spock.Adder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderTest {

    @Test
    public void simpleTest() {
        Adder adder = new Adder();
        assertEquals("1+1 is 2", 2, adder.add(1, 1));
    }

    @Test
    public void orderTest() {
        Adder adder = new Adder();
        assertEquals("Order does not matter", 5, adder.add(3, 2));
        assertEquals("Order does not matter", 5, adder.add(2, 3));
    }
}
