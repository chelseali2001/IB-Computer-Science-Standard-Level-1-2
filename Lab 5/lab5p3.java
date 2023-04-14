import java.util.Scanner;

/**
 * lab5p3 class
 * @author Chelsea Li
 */
class lab5p3 {
  /**
   * Main method
   * @param args
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    boolean error = false;
    int type = 0, length = 0, width = 0;

    System.out.println("Enter 1 for a filled rectangle or enter 2 for an empty rectangle");

    //Checking for invalid inputs
    while (!error) {
      try {
        type = s.nextInt();

        if (type != 1 && type != 2) {
          System.out.println("Error: Enter 1 or 2");
        } else {
          error = true;
        }
      } catch (Exception e) {
        String trash = s.next();
        System.out.println("Error: Enter 1 or 2");
      }
    }

    System.out.println("Enter the length of the rectangle");

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

    System.out.println("Enter the width of the rectangle");

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

    if (type == 1) { //Creating a filled rectangle
      for (int x = 0; x < length; x++) {
        for (int i = 0; i < width; i++) {
          System.out.print("*");
        }

        System.out.println();
      }
    } else { //Creating an empty rectangle
      for (int x = 0; x < length; x++) {
        System.out.print("*");

        for (int i = 1; i < width - 1; i++) {
          if (x == 0 || x == length - 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }

        if (width > 1) {
          System.out.println("*");
        } else {
          System.out.println();
        }
      }
    }
  }
}
