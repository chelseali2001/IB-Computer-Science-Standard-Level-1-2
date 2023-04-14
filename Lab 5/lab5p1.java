import java.util.Random;
import java.util.Scanner;

/**
 * lab5p1 class
 * @author Chelsea Li
 */
class lab5p1 {
  /**
   * Main method
   * @param args
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    Random rand = new Random();
    boolean error = false;

    while (!error) {
      System.out.println("Lets play the Number Guessing Game!");
      System.out.println("Guess a number between 1 and 1000 but enter 0 to exit");

      boolean error1 = false, error2 = false;
      int numbertoguess = rand.nextInt(1000), numberofGuesses = 0;

      //Checking for invalid inputs and to see if the input is correct
      while (!error1) {
        try {
          int input = s.nextInt();
          numberofGuesses++;

          if (input == 0) { //If the user wants to exit, the number will be revealed
            System.out.println("The number was " + numbertoguess);
            error1 = true;
            error = true;
          } else if (input < 0 || input > 1000) { //If your guess is out of bounds
            System.out.println("Error: Integers between 1 and 1000 only");
          } else { //Tells you if your guess is too high, too low, or right
            if (input > numbertoguess) {
              System.out.println("Your guess is too high");
            } else if (input < numbertoguess) {
              System.out.println("Your guess is too low");
            } else {
              System.out.println("You win! It took you " + numberofGuesses + " guess(es)");
              System.out.println("Do you want to play again? Enter Y for yes and N for no");

              //Checking for invalid inputs and seeing whether or not the player wants to play again or exit
              while (!error2) {
                String ans = s.next();

                if (ans.toUpperCase().equals("Y")) {
                  error2 = true;
                  error1 = true;
                } else if (ans.toUpperCase().equals("N")) {
                  error2 = true;
                  error1 = true;
                  error = true;
                } else {
                  System.out.println("Error: Enter Y or N");
                }
              }
            }
          }
        } catch (Exception e) {
          String trash = s.next();
          System.out.println("Error: Integers between 1 and 1000 only");
        }
      }
    }
  }
}
