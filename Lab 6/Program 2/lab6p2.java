import java.util.Scanner;

/**
 * lab6p2 class
 * @author Chelsea Li
 */
class lab6p2 {
  /**
   * Main method
   * @param args
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    boolean error = false;
    int width = 0, length = 0;

    System.out.println("Please enter the width of the multiplication table");

    //Checking for invalid inputs
    while (!error) {
      try {
        width = s.nextInt();

        if (width < 1) {
          System.out.println("Error: Positive integers only");
        } else {
          error = true;
        }
      } catch (Exception e) {
        String trash = s.next();
        System.out.println("Error: Positive integers only");
      }
    }

    System.out.println("Please enter the length of the multiplication table");

    //Checking for invalid inputs
    while (error) {
      try {
        length = s.nextInt();

        if (length < 1) {
          System.out.println("Error: Positive integers only");
        } else {
          error = false;
        }
      } catch (Exception e) {
        String trash = s.next();
        System.out.println("Error: Positive integers only");
      }
    }

    //Creating the table (with the correct spacings)
    for (int x = 1; x <= length; x++) {
      for (int i = 1; i <= width; i++) {
        System.out.print(x * i);
        for (int j = 0; j < String.valueOf(length * width).length() - String.valueOf(x * i).length() + 1; j++) {
          System.out.print(" ");
        }
      }

      System.out.println();
    }
  }
}
