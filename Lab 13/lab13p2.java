import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import java.math.*;
class lab13p2 {
    public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);

        int z;
        String digits = "";
        String a0 = "";
        String a3 = "3";
        String[] dig = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String d = "";
        String f = "";
        int g = 0;
        int h = 0;
        int i;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int x;
        int answer;
        boolean Error = true;
        String trash = "";
        int exit = 0;

        //user input
        System.out.println("Enter any of the 11 digits of the barcode. Enter the letter a for the missing digit. Enter -1 to exit");
        for (x = 0;; x++) {
            int a = 0;
            int b = 0;
            int c = 0;
            digits = s.nextLine();
            if (digits.equals("-1")) {
                exit = exit + 1;
                break;
            }
            
            char[] str = digits.toCharArray();
            
            //checking for integers
            for (i = 0; i < str.length; i++) {
                String num = "";
                num = Character.toString(str[i]);
                if(Arrays.asList(dig).contains(num)) { //if digit is a number
                    b += i;
                } else if (Character.toString(str[i]).equalsIgnoreCase("a")) {//missing digit
                    a = a + 1;
                    b += i;
                    if (a > 1) { //if there's more than 1 missing number
                        System.out.println("Error: You can only have 1 missing digit");
                        c = c + 1;
                        break;
                    }
                }
                else { //if digit is a character
                    System.out.println("Error: Must enter integers");
                    c = c + 1;
                    break;
                }
            }
            
            if (c == 0) { //if all of the digits are numbers
                if (b == 66) { //if there's 12 digits
                    if (a == 0) { //if there's no missing digit
                        System.out.println("There has to be a missing digit");
                        continue;
                    } else {
                        break;
                    }
                } else { //if there's less/more than 12 digits
                    System.out.println("Error: There has to be 12 digits");
                    continue;
                }
            } else {
                continue;
            }
        }

        if (exit == 0) {
            //adding up the digits
            char[] str0 = digits.toCharArray();
            for (x = 0; x < str0.length; x++) {
                d = Character.toString(str0[x]);
                o = x % 2;
                if (d.equalsIgnoreCase("a")) {
                    if (o == 0) { //if the missing digit is the even position digit
                        f = a3 + d;
                    } else {
                        f = d;
                    }
                } else {
                    g = Character.getNumericValue(str0[x]);
                    if (o == 0) { //if the digit is the 1st, 3rd, or 11th digit
                        h = 3 * g;
                        j += h;
                    } else { //if it's not
                        j += g;
                    }
                }
            }

            k = j % 10; //finding the remainder
            if (k == 0) { //if there's no remainder
                System.out.println("The missing digit is 0");
            } else {
                l = 10 - k; //subtract 10 by the remainder to get the 12th digit
                if (f.equalsIgnoreCase("3a")) { //if the missing digit is the 1st, 3rd, or 11th digit
                    for (x = 1; x <= 9; x++) { //finding the missing digit
                        m = (3 * x) + k;
                        n = m % 10;
                        if (n == 0) { //if numbers add up to a multiple of 10
                            break;
                        } else { //if it does not
                            continue;
                        }
                    }
                    System.out.println("The missing digit is " + x);
                } else { //if it's not
                    System.out.println("The missing digit is " + l);		
                }
            }

            System.out.println();
            lab13p2.repeat(args);
        } else {//exit program
            System.out.println("Bye");
        }
    }//main

    //repeat program
    public static void repeat(String[] args) {
	    Scanner s = new Scanner(System.in);

        int answer;
        int x;
        boolean Error = true;
        String trash = "";
            
        System.out.println("Do you want to try more numbers? Enter 1 for yes or 0 for no");
        for (x = 0;; x++) {
            try{
                answer = s.nextInt();
                if (answer == 1) {
                    lab13p2.main(args);
                    Error = true;
                    break;
                } else if (answer == 0) {
                    System.out.println("Bye");
                    break;
                } else {
                    System.out.println("Error: You must enter 1 or 0");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error: You must enter 1 or 0");
                trash = s.next();
            }
        }
    }//repeat	
}//num