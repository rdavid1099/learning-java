import java.util.Random;

public class Robot {
  private String name;
  private char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  private Random rand = new Random();

  public Robot() {
    this.name = this.generateName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public void reset() {
    this.name = this.generateName();
  }
  
  private String generateName() {
    String generatedName = "";
    for(int i = 0; i < 5; i++) {
      generatedName += (i < 2) ? Character.toString(letters[rand.nextInt(26) + 1]) : Integer.toString(rand.nextInt(10));
    }
    return generatedName;
  }
}