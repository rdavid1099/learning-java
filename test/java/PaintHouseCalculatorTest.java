import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaintHouseCalculatorTest {
  
  @Test
  public void testPaintHouseTotalSurfaceArea() {
    PaintHouseCalculator calculate = new PaintHouseCalculator([10.0, 15.0, 12.0]);
    calculate.addDoor([3.0, 7.5]);
    assertEquals(1, calculate.getDoorCount());
  }
}
