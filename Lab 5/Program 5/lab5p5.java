import java.util.Scanner;

/**
 * lab5p5 class
 * @author Chelsea Li
 */
class lab5p5 {
  /**
   * Main method
   * @param args
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
      
    boolean error = false;
    int input = 0;

    System.out.println("Enter a number between 1 and 168");
    
    //Checking for invalid inputs
    while (!error) {
      try {
        input = s.nextInt();

        if (input < 1 || input > 168) {
          System.out.println("Error: Enter a number between 1 and 168");
        } else {
          error = true;
        }
      } catch (Exception e) {
        String trash = s.next();
        System.out.println("Error: Enter a number between 1 and 168");
      }
    }

    System.out.println("Prime number #" + input + " is " + find(2, input, 0));
  }

  /**
   * Finds the nth prime number
   * @param num
   * @param input
   * @param counter
   */
  public static int find(int num, int input, int counter) {
    //Searching for all of the prime numbers and tracking their index
    for (int x = 2; x < num; x++) {
      if (num % x == 0) {
        num++;
        return find(num, input, counter);
      }
    }

    counter++;

    if (counter == input) {
      return num;
    } else {
      num++;
      return find(num, input, counter);
    }
  }
}
