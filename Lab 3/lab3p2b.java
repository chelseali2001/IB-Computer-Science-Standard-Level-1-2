import java.io.*;
import java.util.Random;
import java.util.Scanner;
class lab3p2b {
    public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);
	
        int x;
        double a;
        double b;
        double c;
        String trash = "";
        boolean Error = true;

        System.out.println("Welcome to my pythagorean calculator!");
        System.out.println("Please enter the value of the shorter side of the triangle or enter -1 as the unknown side");
        for (x = 0;; x++) {
            try {
                a = s.nextDouble();
                if ((a == 0) || (a < -1)) {
                    System.out.println("Error: numbers that are 0 or less than -1 are invalid. Try again");
                    continue;
                } 
                Error=true;
                break;
            } catch (Exception e) {
                trash=s.next();
                System.out.println("Error: No letters. Try again");
            }
        }

        System.out.println("Please enter the value of the longer side of the triangle or enter -1 as the unknown side");
        for (x = 0;; x++) {
            try {
                b = s.nextDouble();
                if ((b == 0) || (b < -1)) {
                    System.out.println("Error: numbers that are 0 or less than -1 are invalid. Try again");
                    continue;
                } else if ((a == -1) & (b == -1)) {
                    System.out.println("Error: there's already a -1. Try again");
                    continue;
                } else if ((a == -1) || (b == -1)) {
                    System.out.println("Please enter the value of the hypotenuse of the triangle or enter -1 as the unknown side");
                    for (x = 0;; x++) {
                        try {
                            c = s.nextDouble();
                            if ((c == 0) || (c < -1)) {
                                System.out.println("Error: numbers that are 0 or less than -1 are invalid. Try again");
                                continue;
                            } else if ((a == -1) & (c == -1)) {
                                System.out.println("Error: There's already a -1. Try again");
                                continue;
                            } else if ((b == -1) & (c == -1)) {
                                System.out.println("Error: There's already a -1. Try again");
                                continue;
                            } else if ((a == -1) & (b > 0) & (c > 0)) {
                                if (b > c) {
                                    System.out.println("a is a non-real number");
                                    System.exit(0);
                                } else if (b == c) {
                                    System.out.println("The unknown side is " + b);
                                    System.out.println("The angles are all 60 degrees");
                                    System.exit(0);
                                }
                                a = Math.sqrt((c * c) - (b * b));
                                double rounda = Math.round(a * 100.0) / 100.0;
                                System.out.println("The unknown side is " + rounda);
                                double anglea = Math.toDegrees(Math.asin(rounda / c)); 
                                double anglex = Math.round(anglea * 1) / 1;
                                double angleb = Math.toDegrees(Math.asin(b / c));			
                                double angley = Math.round(angleb * 1) / 1;
                                double anglec = 180 - (anglex + angley);
                                System.out.println("The angles are " + anglex + ", " + angley + ", " + anglec);
                                System.exit(0);
                            } else if ((b == -1) & (a > 0) & (c > 0)) {
                                if (a > c) {
                                    System.out.println("b is a non-real number");
                                    System.exit(0);
                                } else if (a == c) {
                                    System.out.println("The unknown side is " + a);
                                    System.out.println("All of the angles are 60 degrees");
                                    System.exit(0);
                                }
                                b = Math.sqrt((c * c) - (a * a));
                                double roundb = Math.round(b * 100.0) / 100.0;
                                System.out.println("The unknown side is " + roundb);
                                double anglea = Math.toDegrees(Math.asin(a / c)); 
                                double anglex = Math.round(anglea * 1) / 1;
                                double angleb = Math.toDegrees(Math.asin(roundb / c));			
                                double angley = Math.round(angleb * 1) / 1;
                                double anglec = 180 - (anglex + angley);
                                System.out.println("The angles are " + anglex + ", " + angley + ", " + anglec);
                                System.exit(0);
                            } else if ((c == -1) & (a > 0) & (b > 0)) {
                                c = Math.sqrt((a * a) + (b * b));
                                double roundc = Math.round(c * 100.0) / 100.0;
                                System.out.println("The unknown side is " + roundc);
                                double anglea = Math.toDegrees(Math.asin(a / roundc)); 
                                double anglex = Math.round(anglea * 1) / 1;
                                double angleb = Math.toDegrees(Math.asin(b / roundc));			
                                double angley = Math.round(angleb * 1) / 1;
                                double anglec = 180 - (anglex + angley);
                                System.out.println("The angles are " + anglex + ", " + angley + ", " + anglec);
                                System.exit(0);
                            } else if ((a > 0) & (b > 0) & (c > 0)) {
                                System.out.println("Error: One of these numbers have to be -1. Try again");
                                continue;
                            } 
                        } catch (Exception e) {
                            trash=s.next();
                            System.out.println("Error: No letters. Try again");
                        }
                    }
                } else if ((a > 0) & (b > 0)) {
                    if (a == b) {
                        double d = Math.sqrt((a * a) + (b * b));
                        double roundd = Math.round(d * 100.0) / 100.0;
                        System.out.println("The unknown side is " + roundd);
                        double rounde = roundd / 2;
                        double anglea = Math.toDegrees(Math.acos(rounde / a));
                        double anglex = Math.round(anglea * 1) / 1;
                        double angleb = 180 - (anglex + anglex);
                        System.out.println("The angles are " + anglex + ", " + anglex + ", " + angleb);
                        System.exit(0);
                    }
                    Error=true;
                    break;
                }
            } catch (Exception e) {
                trash=s.next();
                System.out.println("No letters allowed. Try again");
            }
            
        }

        double d = Math.sqrt((a * a) + (b * b));
        double roundd = Math.round(d * 100.0) / 100.0;
        System.out.println("The unknown side is " + roundd);
        double anglea = Math.toDegrees(Math.asin(a / roundd)); 
        double anglex = Math.round(anglea * 1) / 1;
        double angleb = Math.toDegrees(Math.asin(b / roundd));			
        double angley = Math.round(angleb * 1) / 1;
        double anglec = 180 - (anglex + angley);
        System.out.println("The angles are " + anglex + ", " + angley + ", " + anglec); 
    } //main
}//num

