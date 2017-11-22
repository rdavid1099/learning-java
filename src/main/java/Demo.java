public class Demo {
  private double[] mpgData;

  public Demo(double[] mpgData) {
    this.mpgData = mpgData;
  }

  public static String main(String[] args) {
    return "Hello, World!";
  }
  
  public double getMPG() {
    return (this.mpgData[0]/this.mpgData[1]) * this.mpgData[2];
  }
}