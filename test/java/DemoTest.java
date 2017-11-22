import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {
  
  @Test
  public void testThatDemoReturnsTheCorrectGreeting() {
    assertEquals("Hello, World!", Demo.main());
  }
  
  public void testThatDemoReturnsCorrectTravelCost() {
    assertEquals(63.75, new Demo([500, 20, 2.55]).getTravelCost());
  }
  
}
