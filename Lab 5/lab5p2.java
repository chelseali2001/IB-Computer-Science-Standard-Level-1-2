import java.util.Scanner;

/**
 * lab5p2 class
 * @author Chelsea Li
 */
class lab5p2 {
  /**
   * Main method
   * @param args
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean error = false;
    int input = 0, counter = 1;

    System.out.println("Please enter a number or 0 to exit");
      
    //Checking for invalid inputs
    while (!error) {
      try {
        input = s.nextInt();

        if (input == 0) { //If the user wants to exit
          error = true;
        } else if (input < 0) {
          System.out.println("Error: Positive integers only");
        } else {
          //Printing out the number pyramid
          for (int x = input; x > 0; x--) {
            for (int i = 1; i <= counter; i++) {
              System.out.print(x + " ");
            }

            counter++;
            System.out.println();
          }

          error = true;
        }
      } catch (Exception e) {
        String trash = s.next();
        System.out.println("Error: Positive integers only");
      }
    }
  }
}
