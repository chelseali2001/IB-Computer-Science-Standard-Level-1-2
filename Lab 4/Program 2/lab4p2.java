import java.util.Scanner;

/**
 * lab4p2 class
 * @author Chelsea Li
 */
class lab4p2 {
    /**
     * Main method
     * @param args
     */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        boolean done = false;
        float sum = 0, scores = 0;
        int x = 0;
        String trash = "";

        System.out.println("Let's calculate the class average!");

        System.out.println("Please enter the scores, then enter -1 to stop.");

        //Checking for invalid inputs
        while (!done) {
            try {
                scores = s.nextFloat();

                if (scores == -1) {
                    done = true;
                } else if (scores < -1) {
                    System.out.println("Error: no negative numbers. Please try again");
                } else {
                    sum += scores;
                    x++;
                }
            } catch (Exception e) {
                trash = s.next();
                System.out.println("Error: You can't enter letters. Please try again");
            }
        }

        //Calculating the average
        double average = sum / x;
        double average1 = Math.round(average * 1000.0) / 1000.0;

        //Determining the average letter grade
        if (average1 < 60.0) {
            System.out.println("The class average is " + average1 + " which is a F");
        } else if (average1 < 70.0) {
            System.out.println("The class average is " + average1 + " which is a D");
        } else if (average1 < 80.0) {
            System.out.println("The class average is " + average1 + " which is a C");
        } else if (average1 < 90) {
            System.out.println("The class average is " + average1 + " which is a B");
        } else if (average1 < 100) {
            System.out.println("The class average is " + average1 + " which is a A");
        }
    } //main
 }//num 

