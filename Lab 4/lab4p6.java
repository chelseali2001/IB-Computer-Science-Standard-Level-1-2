import java.io.*;
import java.util.Random;
import java.util.Scanner;
class lab4p6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        double number = 0;
        double sum = 0;
        double reciprical = 0;
        double count = 0;
        int answer = 0; 
        int j;
        int i;
        double y = 1000.0;
        boolean Error=true;
        String trash = "";

        System.out.println("Please enter 10 numbers");
        for (j = 0; j < 10; j++) {
            try {
                number = s.nextDouble();
                if (number == 0.0) {
                    j = j - 1;
                    System.out.println("Do you want to stop (Please enter 1 for yes or 2 for no)?");	
                    for (i = 0;; i++) {
                        try {
                            answer = s.nextInt();
                            if (answer == 1) {
                                double sum1 = Math.round(sum * 1000.0) / 1000.0;
                                double x = sum1 * 1000.0;
                                double e = x / gcd(x,y);
                                double r = y / gcd(x,y);
                                if (r == 1) {
                                    System.out.println("The sum of the recipricals is " + e);
                                } else {
                                    System.out.println("The sum of the recipricals is " + e + "/" + r);
                                }
                                System.out.println("Bye");
                                System.exit(0);
                            } else if (answer == 2) {
                                System.out.println("Please enter the next few numbers");
                                Error=true;
                                break;
                            } else if ((answer != 1) || (answer != 2)) {
                                System.out.println("Error: You have to enter 1 or 2. Please try again");
                                continue;
                            }
                        } catch (Exception e) {
                            trash=s.next();
                            System.out.println("Error: You can't enter letters. Please try again");
                        }
                    }
                }
                Error=true;
                reciprical = (1 / number);
            } catch (Exception e){
                j = j - 1;
                trash=s.next();
                System.out.println("Error: You can't enter letters. Please try again");
            }
            if (number != 0) {
            sum += reciprical;
            }
        }
        double sum1 = Math.round(sum * 1000.0) / 1000.0;
        double x = sum1 * 1000.0;
        double e = x / gcd(x,y);
        double r = y / gcd(x,y);
        if (r == 1) {
            System.out.println("The sum of the recipricals is " + e);
        } else {
            System.out.println("The sum of the recipricals is " + e + "/" + r);
        }	
        } //main
        
        public static double gcd(double q, double w) {
        if (w == 0) {
            return q;		
        } else {
            return gcd(w, q % w);
        }
    }
}//num