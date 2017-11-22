import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GroceryListTest {
  
  @Test
  public void testGroceryListGetsTotal() {
    assertEquals(35.9, new GroceryList([10.00, 5.50, 4.75, 3.90, 11.75).getTotal());
  }
}
