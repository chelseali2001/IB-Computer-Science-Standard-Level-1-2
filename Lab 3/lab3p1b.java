import java.io.*;
import java.util.Random;
import java.util.Scanner;
class lab3p1b {
	public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);

        String trash = "";
        boolean Error = true;
        double A;
        double B;
        double C;
        int x;

        System.out.println("Please enter the value of A in the quadratic formula");
        for (x = 0;; x++) {
            try {
                A = s.nextDouble();
                if (A == 0) {
                    System.out.println("Error: A can't equal to 0. Try again");
                    continue;
                }
                Error=true;
                break;
            } catch (Exception e) {
                trash=s.next();
                System.out.println("Error: No letters allowed. Try again");
            }
        }

        System.out.println("Please enter the value of B in the quadratic formula");
        for (x = 0;; x++) {
            try {
                B = s.nextDouble();
                Error=true;
                break;
            } catch (Exception e) {
                trash=s.next();
                System.out.println("Error: No letters allowed. Try again");
            }
        }

        System.out.println("Please enter the value of C in the quadratic formula");
        for (x = 0;; x++) {
            try {
                C = s.nextDouble();
                Error=true;
                break;
            } catch (Exception e) {
                trash=s.next();
                System.out.println("Error: No letters allowed. Try again");
            }
        }

        if ((A == 0) & (B == 0) & (C == 0)) {
            System.out.println("The root is 0");
            System.exit(0);
        }  

        double discriminant = B * B - 4 * A * C;

        if (discriminant <= -1) {
            double roota1 = -B / 2;
            double roota2 = discriminant * -1 / 2;
            System.out.println("The roots are (" + roota1 + " + " + roota2 + "i) and (" + roota1 + " - " + roota2 + "i)");
            System.exit(0);
        } 

        double fulldiscriminant = Math.sqrt(discriminant);

            double root1 = (-B + fulldiscriminant) / (2 * A);
            double root2 = (-B - fulldiscriminant) / (2 * A);
            double round1 = Math.round(root1 * 100.0) / 100.0;
            double round2 = Math.round(root2 * 100.0) / 100.0;

        if (((-B + fulldiscriminant) == 0) & ((-B - fulldiscriminant) == 0)) {
            System.out.println("The roots are 0 and 0");
        } else {
            System.out.println("The roots are " + round1 + " and " + round2);
        }

    } //main
}//num

