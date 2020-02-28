import java.math.BigInteger;

/**
 * lab6p1 class
 * @auther Chelsea Li
 */
class lab6p1 {
  /**
   * Main method
   * @param args
   */
  public static void main(String args[]) {
    BigInteger c = BigInteger.valueOf(0);

    for (int x = 7; x <= 70000; x++) {
      c = c.add(BigInteger.valueOf(x));
    }
    
    System.out.println("The sum of the numbers from 7 to 70,000 is " + c);
  }
}
