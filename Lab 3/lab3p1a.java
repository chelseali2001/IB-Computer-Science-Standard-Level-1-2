import java.io.*;
import java.util.Random;
import java.util.Scanner;
class lab3p1a {
	public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);

        System.out.println("Please enter the values of A, B, and C in the quadratic formula");
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        if ((A == 0) & (B == 0) & (C == 0)) {
            System.out.println("The root is 0");
            System.exit(0);
        }  else if (A == 0) {
            System.out.println("Error: A can't equal to 0");
            System.exit(0);
        }

        double discriminant = B * B - 4 * A * C;

        if (discriminant <= -1) {
            System.out.println("They're non-real roots");
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

