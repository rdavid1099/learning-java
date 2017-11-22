import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Test
    public void testThatDemoReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", Demo.main());
    }

}
