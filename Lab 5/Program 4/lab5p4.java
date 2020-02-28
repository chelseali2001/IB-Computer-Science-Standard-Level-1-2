import java.util.Scanner;

/**
 * lab5p4 class
 * @author Chelsea Li
 */
class lab5p4 {
  /**
   * Main method
   * @param args
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean error = false;
    int input = 0, fac = 1;

    System.out.println("Enter an integer");

    //Checking for invalid inputs
    while (!error) {
      try {
        input = s.nextInt();

        if (input < 0) {
          System.out.println("Error: Positive integers only");
        } else {
          error = true;
        }
      } catch (Exception e) {
        String trash = s.next();
        System.out.println("Error: Positive integers only");
      }
    }

    //Finding the factorial of the input value
    if (input == 0) {
      System.out.println("0! = 1");
    } else {
      for (int x = 1; x <= input; x++) {
        fac *= x;
      }

      System.out.println(input + "! = " + fac);
    }
  }
}
