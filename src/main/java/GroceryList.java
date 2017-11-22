package grocerylist;

public class GroceryList {
  public double[] prices = new double[5];
  
  public GroceryList(double[] prices) {
    this.prices = prices;
  }

  public double getTotal() {
    return this.prices[0] + this.prices[1] + this.prices[2] + this.prices[3] + this.prices[4];
  }
}