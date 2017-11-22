package painthousecalculator;

class PaintHouseCalculator {
  private double[] lwh = new double[3];
  private double[][] doors = new double[1][2];
  private double[][] windows = new double[1][2];

  public PaintHouseCalculator(double[] lwh) {
    this.lwh = lwh;
  }
  
  public void addDoor(double[] lengthWidth) {
    this.doors = this.push(this.doors, lengthWidth);
  }
  
  public void addWindow(double[] lengthWidth) {
    this.windows = this.push(this.windows, lengthWidth);
  }

  public int getDoorCount() {
    return this.doors.length;
  }
  
  public int getWindowCount() {
    return this.windows.length;
  }
  
  private double[][] push(double[][] arr, double[] data) {
    int newLength = arr.length + 1;
    double[][] newArray = new double[newLength][2];
    for (int x = 1; x <= newLength; x++)  {
      newArray[x] = (x == newLength) ? data : arr[x];
    }
    return newArray;
  }
}