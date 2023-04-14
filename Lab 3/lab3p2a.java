import java.io.*;
import java.util.Random;
import java.util.Scanner;
class lab3p2a {
    public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);
	
        System.out.println("Welcome to my pythagorean calculator!");
        System.out.println("Please enter the value of the shorter side or enter -1 as the unknown side");
        double a = s.nextDouble();
        if ((a == 0) || (a < -1)) {
            System.out.println("Error: numbers that are 0 or less than -1 are invalid");
            System.exit(0);
        } 

        System.out.println("Please enter the value of the longer side or enter -1 as the unknown side");
        double b = s.nextDouble();
        if ((b == 0) || (b < -1)) {
            System.out.println("Error: numbers that are 0 or less than -1 are invalid");
            System.exit(0);
        } else if ((a == -1) & (b == -1)) {
            System.out.println("Error: there's already a -1");
            System.exit(0);
        } else if ((a == -1) || (b == -1)) {
            System.out.println("Please enter the value of the hypotenuse or enter -1 as the unknown side");
            double c = s.nextDouble();
            if ((c == 0) || (c < -1)) {
                System.out.println("Error: numbers that are 0 or less than -1 are invalid");
                System.exit(0);
            } else if ((a == -1) & (c == -1)) {
                System.out.println("Error: There's already a -1");
                System.exit(0);
            } else if ((b == -1) & (c == -1)) {
                System.out.println("Error: There's already a -1");
                System.exit(0);
            }
            
            if ((a == -1) & (b > 0) & (c > 0)) {
                if (b > c) {
                    System.out.println("a is a non-real number");
                    System.exit(0);
                } 
                a = Math.sqrt((c * c) - (b * b));
                double rounda = Math.round(a * 100.0) / 100.0;
                System.out.println("The unknown side is " + rounda);
                System.exit(0);
            } else if ((b == -1) & (a > 0) & (c > 0)) {
                if (a > c) {
                    System.out.println("b is a non-real number");
                    System.exit(0);
                } 
                b = Math.sqrt((c * c) - (a * a));
                double roundb = Math.round(b * 100.0) / 100.0;
                System.out.println("The unknown side is " + roundb);
                System.exit(0);
            } else if ((c == -1) & (a > 0) & (b > 0)) {
                c = Math.sqrt((a * a) + (b * b));
                double roundc = Math.round(c * 100.0) / 100.0;
                System.out.println("The unknown side is " + roundc);
                System.exit(0);
            } else if ((a > 0) & (b > 0) & (c > 0)) {
                System.out.println("Error: One of these numbers have to be -1");
                System.exit(0);
            } 
        }

        if ((a > 0) & (b > 0)) {
            double d = Math.sqrt((a * a) + (b * b));
            double roundd = Math.round(d * 100.0) / 100.0;
            System.out.println("The unknown side is " + roundd);
        }

    } //main
}//num

