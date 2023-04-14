import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class lab9 {
    //menu
    public static void main(String args[]) { 
	    Scanner s = new Scanner(System.in);
	
        int x;
        int lab;
        boolean Error = true;
        String trash = "";

        //pick a program
        System.out.println("Which program do you want to try out? (Enter the program number or 0 to exit)");
        System.out.println("0. Exit");
        System.out.println("1. lab9p1: Finding the smallest");
        System.out.println("2. lab9p2: Prime time");
        System.out.println("3. lab9p3: Prime Factorization");
        System.out.println("4. lab9p4: Temp Changer");
        System.out.println("5. lab9p5: More rectangles");
        System.out.println("6. lab9p6: Reverser");
        System.out.println("7. lab9p7: Perfect Numbers");
        System.out.println();

        //matching number with program number
        for (x = 0;; x++) {
            try {
                lab = s.nextInt();
                if (lab < 0) {
                    System.out.println("Error: You must enter a number between 0-7");
                    continue;
                } else if (lab > 7) {
                    System.out.println("Error: You must enter a number between 0-7");
                    continue;
                } else if (lab == 0) {
                    System.out.println("Bye");
                    System.exit(0);
                } else if (lab == 1) {
                    lab9.p1(args);
                    Error = true;
                    break;
                } else if (lab == 2) {
                    lab9.p2(args);
                    Error = true;
                    break;
                } else if (lab == 3) {
                    lab9.p3(args);
                    Error = true;
                    break;
                } else if (lab == 4) {
                    lab9.p4(args);
                    Error = true;
                    break;
                } else if (lab == 5) {
                    lab9.p5(args);
                    Error = true;
                    break;
                } else if (lab == 6) {
                    lab9.p6(args);
                    Error = true;
                    break;
                } else if (lab == 7) {
                    lab9.p7(args);
                    Error = true;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: No letters or decimals allowed");
                trash = s.next();
            }
        }
    }//main

    //lab9p1
    public static void p1(String args[]) {
	    Scanner s = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int i;
        int x;
        boolean Error = true;
        String trash = "";

        //pick three numbers
        for (i = 0;; i++) {
            System.out.println("Enter 3 numbers. Enter any letter to exit.");
            for (x = 0;; x++) {
                try {
                    a = s.nextInt();
                    Error = true;
                    break;
                } catch (Exception e) {
                    lab9.main(args);
                }
            }
            for (x = 0;; x++) {
                try {
                    b = s.nextInt();
                    Error = true;
                    break;
                } catch (Exception e) {
                    lab9.main(args);
                }
            }
            for (x = 0;; x++) {
                try {
                    c = s.nextInt();
                    Error = true;
                    break;
                } catch (Exception e) {
                    lab9.main(args);
                }
            }

            System.out.println("The smallest number is " + (stuff(a, b, c)));	//answer
            
            //ask user to continue or exit lab9p1
            System.out.println("Do you want to enter more numbers? Enter 1 for yes or 0 for no.");
            for (x = 0;; x++) {
                try {
                    d = s.nextInt();
                    if (d == 1) {
                        break;
                    } else if (d == 0) {
                        lab9.main(args);
                    } else {
                        System.out.println("Error: You must enter 1 or 0.");
                    }	
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter 1 or 0.");
                }
            } 
        }//end of for loop
    }//p1
    //finding the smallest number
    public static int stuff(int a, int b, int c) {
        int z = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String c1 = Integer.toString(c);
        String str = (a1 + " " + b1 + " " + c1 + " ");
        String[] str1 = str.split(" ");
        Arrays.sort(str1);	//used to sort the numbers in order
        for (int x = 0; x < 1; x++) {
            z = Integer.parseInt(str1[x]);
        }
        return z;
    }//stuff

    //lab9p2
    public static void p2(String args[]) {
	    Scanner s = new Scanner(System.in);

        int a;
        int c;
        int i;
        int x;
        boolean Error = true;
        String trash = "";

        for (i = 0;; i++) {
            //user enters number
            System.out.println("Enter any number to see if it's prime. Or enter 0 to exit.");
            for (x = 0;; x++) {
                try {
                    a = s.nextInt(); 
                    if (a < 0) {
                        System.out.println("Error: You must enter a positive number.");
                        continue;
                    } else if (a == 0) {
                        lab9.main(args);
                    } 
                    Error = true;
                    break;
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter a positive number.");
                }
            }

            //answer
            if (stuff1(a)) {
                System.out.println(a + " is a prime number");
            } else {
                System.out.println(a + " is not a prime number");
            }
            
            //repeat program or exit
            System.out.println();
            System.out.println("Would you like to enter another number? Enter 1 for yes or 0 for no.");
            for (x = 0;; x++) {
                try {
                    c = s.nextInt();
                    if (c == 1) {
                        Error = true;
                        break;
                    } else if (c == 0) {
                        lab9.main(args);
                    } else {
                        System.out.println("Error: You must enter 1 or 0");
                    }
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter 1 or 0");
                }
            }
        }//end of for loop
    }//p2
    //determining if the number is prime
    public static boolean stuff1(int a) {
        int y = 0;
        int z = 0;
        boolean b = false;
        if (a == 1) {
            return false;
        } else {
            for (int x = 1; x <= a; x++) {
                z = a%x;
                if (((x > 1) && (x < a)) && (z == 0)) {
                    y++;
                } 
            }
            if (y == 0) {
                return true;
            } 
            return false;
        }
    }//stuff1	

    //lab9p3
    public static void p3(String args[]) {
	    Scanner s = new Scanner(System.in);
	
        int a;
        int i;
        int x;
        int an;
        boolean Error = true;
        String trash = "";

        for (i = 0;; i++) {
            //user enters number
            System.out.println("Enter any number and this program will find its prime factors. Enter 0 to exit.");
            for (x = 0;; x++) {
                try {
                    a = s.nextInt();
                    if (a == 0) {
                        lab9.main(args);
                    } else if (a < 0) {
                        System.out.println("Error: You must enter a positive number");
                        continue;
                    } 
                    Error = true;
                    break;
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter a positive number");
                }
            }
            
            //answer
            if (a == 1) {
                System.out.println("1 does not have prime factors");
                System.out.println();
            } else {
                System.out.print("The prime factor(s) of " + a + " is/are ");
                for (Integer integer : primeFactors(a)) {
                    System.out.print(integer + " ");
                }
                System.out.println();
                System.out.println();
            }
            
            //repeat or exit the program
            System.out.println("Do you want to try a different number? Enter 1 for yes or 0 for no.");
            for (x = 0;; x++) {
                try {
                    an = s.nextInt();
                    if (an == 1) {
                        break;
                    } else if (an == 0) {
                        lab9.main(args);
                    } else {
                        System.out.println("Error: You must enter 1 or 0");
                        continue;
                    }
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter 1 or 0");
                }
            }
        }//end of for loop
    }//p3
    //finding prime factors
    public static List<Integer> primeFactors(int a) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= a / i; i++) {
            while (a % i == 0) {
                factors.add(i);
                a /= i;
            }
        }
        if (a > 1) {
            factors.add(a);
        }
        return factors;
    }//primeFactors

    //lab9p4
    public static void p4(String args[]) {
	    Scanner s = new Scanner(System.in);

        double a;
        int b;
        int c;
        char d;
        int f;
        double g;
        int i;
        int j;
        int x;
        boolean Error = true;
        String trash = "";

        for (i = 0;; i++) {
            //user enters temperature
            System.out.println("Enter the temperature, or enter any letter to exit.");
            for (x = 0;; x++) {
                try {
                    a = s.nextDouble();
                    Error = true;
                    break;
                } catch (Exception e) {
                    lab9.main(args);
                }
            }
            
            //user enter if the temperature is in Fahrenheit or Celsius
            System.out.println("Is this in Fahrenheit or Celsius (Enter f or F for Fahrenheit, c or C for Celsius)? Enter any number x or X to exit.");
            for (x = 0;; x++) {
                try {
                    d = s.next().charAt(0);
                    if ((d == 'f') || (d == 'F')) {
                        break;
                    } else if ((d == 'c') || (d == 'C')) {
                        break;
                    } else if ((d == 'x') || (d == 'X')) {
                        lab9.main(args);
                    } else {
                        System.out.println("Error: You must enter f, F, c, C, x, or X");
                        continue;
                    }
                    Error = true;
                    break;
                } catch (Exception e) {
                    System.out.println("Error: Can't read message");
                }
            }
            
            //user enters number of iterations
            System.out.println("How many iterations do you want? (Enter any letter to exit)");
            for (x = 0;; x++) {
                try {
                    b = s.nextInt();
                    if (b <= 0) {
                        System.out.println("Error: You must enter a positive number");
                        continue;
                    }
                    Error = true;
                    break;
                } catch (Exception e) {
                    lab9.main(args);
                }
            }
            
            System.out.println();
            
            f = b % 2;	//determines if the number of iterations is an even number
            if ((d == 'f') || (d == 'F')) {	//if user enters f or F
                if (f == 0) {	//if the number of iterations is an even number
                    for (x = 1; x <= b; x++) {	//convertions 
                        a = lab9.ftoc(a);
                        a = lab9.ctof(a);
                    }
                    g = Math.round(lab9.ctof(a) * 100.0) / 100.0;
                    System.out.println("The converted temperature is " + g + "F");
                } else {	//if the number of iterations is an odd number
                    for (x = 1; x <= b - 1; x++) {	//convertions 
                        a = lab9.ftoc(a);
                        a = lab9.ctof(a);
                    }
                    a = lab9.ftoc(a);
                    g = Math.round(lab9.ftoc(a) * 100.0) / 100.0;
                    System.out.println("The converted temperature is " + g + "C");
                }
            } else if ((d == 'c') || (d == 'C')) {	//if user enters c or C
                if (f == 0) {	//even number of iterations
                    for (x = 1; x <= b; x++) {	//convertions
                        a = lab9.ctof1(a);
                        a = lab9.ftoc1(a);
                    }
                    g = Math.round(lab9.ftoc1(a) * 100.0) / 100.0;
                    System.out.println("The converted temperature is " + g + "C");
                } else {	//odd number of iterations
                    for (x = 1; x <= b - 1; x++) {	//convertions
                        a = lab9.ctof1(a);
                        a = lab9.ftoc1(a);
                    }
                    a = lab9.ctof1(a);
                    g = Math.round(lab9.ctof1(a) * 100.0) / 100.0;
                    System.out.println("The converted temperature is " + g + "F");			
                }
            }

            System.out.println();
            
            //repeat or exit program
            System.out.println("Do you wanna enter a different number? Enter 1 for yes or 0 for no.");
            for (x = 0;; x++) {
                try {
                    c = s.nextInt();
                    if (c == 1) {
                        break;
                    } else if (c == 0) {
                        lab9.main(args);
                    } else {
                        System.out.println("Error: You must enter 1 or 0");
                        continue;
                    }
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter 1 or 0");
                }
            }
        }//end of for loop
    }//p4
    //if input temperature is in fahrenheit
    //fahrenheit to celsius
    public static double ftoc(double a) {
        double z = ((a - 32) * 5) / 9;
        return z;
    }//ftoc
    //celsius to fahrenheit
    public static double ctof(double z) {
        double a = 0;
        a = (z * 9) / 5 + 32;
        return a;
    }//ctof
    //if input temperature is in celsius
    //celcius to fahrenheit
    public static double ctof1(double a) {
        double z = (a * 9) / 5 + 32;
        return z;
    }//ctof1
    //fahrenheit to celcius
    public static double ftoc1(double z) {
        double a = 0;
        a = ((z - 32) * 5) / 9;
        return a;
    }//ftoc1

    //lab9p5
    public static void p5(String args[]) {
	    Scanner s = new Scanner(System.in);

        int a;
        int h;
        int i;	
        int w;
        int x;
        boolean Error = true;
        String trash = "";

        for (i = 0;; i++) {
            //user inputs width of rectangle
            System.out.println("How wide do you want your rectangle to be? (Enter 0 to exit)");
            for (x = 0;; x++) {
                try {
                    w = s.nextInt();
                    if (w == 0) {
                        lab9.main(args);
                    } else if (w < 0) {
                        System.out.println("Error: You must enter a positive integer");
                        continue;
                    }
                    Error = true;
                    break;
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter a positive integer");
                }
            }
            
            //user inputs length of rectangle
            System.out.println("How long do you want your rectangle to be? (Enter 0 to exit)");
            for (x = 0;; x++) {
                try {
                    h = s.nextInt();
                    if (h == 0) {
                        lab9.main(args);
                    } else if (h < 0) {
                        System.out.println("Error: You must enter a positive integer");
                        continue;
                    }
                    Error = true;
                    break;
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter a positive integer");
                }
            }
            
            //repeat or exit program
            if (rec(w, h)) {
                System.out.println();
                System.out.println("Do you want to make another rectangle? Enter 1 for yes or 0 for no.");
                for (x = 0;; x++) {
                    try {
                        a = s.nextInt();
                        if (a == 1) {
                            Error = true;
                            break;
                        } else if (a == 0) {
                            lab9.main(args);
                        } else {
                            System.out.println("Error: You must enter 1 or 0");
                            continue;
                        }
                    } catch (Exception e) {
                        trash = s.next();
                        System.out.println("Error: You must enter 1 or 0");
                    }
                }
            }
        }//end of for loop
    }//p5
    //create rectangle
    public static boolean rec(int w, int h) {
	    Scanner s = new Scanner(System.in);
        boolean z = true;
        System.out.println("What character do you want the rectangle to be made of?");
        String c = s.next();

        for (int x = 1; x <= h; x++) {
            for (int i = 1; i <= w; i++) {
                System.out.print(c);
            }
            System.out.println();
        }

        return true;
    }//rec

    //lab9p6
    public static void p6(String args[]) {
	    Scanner s = new Scanner(System.in);
	
        int a;
        int b;
        int i;
        int x;
        boolean Error = true;
        String trash = "";

        for (i = 0;; i++) {
            System.out.println("Enter a number and this program will reverse it. Enter 0 to exit.");
            for (x = 0;; x++) {
                try {
                    a = s.nextInt();
                    if (a == 0) {
                        lab9.main(args);
                    } else if (a < 0) {
                        System.out.println("Error: Positive numbers only");
                        continue;
                    }
                    Error = true;
                    break;
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: Positive numbers only");
                }
            }

            int rev_number = reverse(a);
            System.out.println(a + " -> " + rev_number);
            System.out.println();
            System.out.println("Do you want to enter a different number? Enter 1 for yes or 0 for no.");
            for (x = 0;; x++) {
                try {
                    b = s.nextInt();
                    if (b == 1) {
                        Error = true;
                        break;
                    } else if (b == 0) {
                        lab9.main(args);
                    } else {
                        System.out.println("Error: You must enter 1 or 0");
                        continue;
                    }
                } catch (Exception e) {
                    trash = s.next();
                    System.out.println("Error: You must enter 1 or 0");
                }
            }
        }//end of for loop
    }//p6
//revering the numbers
    public static int reverse(int a) {
        int z = a;
        int count = 0;
        while (a != 0) {
            a = a / 10;
            count++;
        }
        a = z;
        int sum = 0;
        for (int x = count; x > 0; x--) {
            int sum10 = 1;
            int last = a % 10;
            for (int i = 1; i < x; i++) {
                sum10 = sum10 * 10;
            }
            sum = sum + (last * sum10);
            a = a / 10;
        }

        return sum;
        }//reverse

        //lab9p7
        public static void p7(String[] args) {
        final int LIMIT = 1000;
        boolean isPerfect = false;
        int i;

        for(i = 2; i < LIMIT; i++) { 
            isPerfect = isNumPerfect(i);
            if(isPerfect) {
                System.out.println(i + " is a perfect number");
                System.out.println();
            }
        }
        lab9.main(args);
        }//p7
        //determing if the number is a perfect number
        public static boolean isNumPerfect(int i) {
        boolean isPerfect = false;
        int sum = 1;
        int j;
        int x;

        for(x = 2; x <= i / 2; x++) {
            if(i % x == 0) {
                sum += x;
            }
        }

        if(sum == i) {
            System.out.print("1");
            for (x = 2; x < sum; x++) {
                if (sum % x == 0) {
                    System.out.print(" + " + x);
                }
            }
            System.out.println(" = " + sum);
            isPerfect = true;
        }
        return isPerfect;
    } //isNumPerfect
}//num