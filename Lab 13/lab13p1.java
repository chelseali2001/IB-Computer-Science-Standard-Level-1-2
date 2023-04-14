import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import java.math.*;
class lab13p1 {
    public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);

        String[] dig = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int c = 0;
        int d = 0;
        int f = 0;
        int dig1 = 0;
        int dig3 = 0;
        int dig11 = 0;
        int i;
        int j;
        int x;
        boolean Error = true;
        String trash = "";
        int k;
        int l = 0;
        String digits = "";
        int ok;
        int exit = 0;

        //user input
        System.out.println("Enter the first 11 digits of the barcode. Enter -1 to exit.");
        for (x = 0;; x++) {
            int a = 0;
            int b = 0;
            
            digits = s.nextLine();
            if (digits.equals("-1")) {
                exit = exit + 1;
                break;
            } else {
                char[] str = digits.toCharArray();
                //examines each digit
                for (i = 0; i < str.length; i++) {
                    String num = "";
                    num = Character.toString(str[i]);
                    if(Arrays.asList(dig).contains(num)) { //if digit is a number
                        a += i;
                    } else { //if digit is a character
                        System.out.println("Error: Must enter integers");
                        b = b + 1;
                        break;
                    }
                }

                if (b == 0) { //if all digits are integers
                    if (a == 55) {
                        break;
                    } else {
                        System.out.println("Error: There must be 11 digits");
                        continue;
                    }
                } else { //if there's a character in the input
                    continue;
                }
            }
        }//for

        if (exit == 0) {
            //separates digits
            char[] str0 = digits.toCharArray();
            for (x = 0; x < str0.length; x++) {
                j = Character.getNumericValue(str0[x]);
                l = x % 2;
                if (l == 0) { //multiply even positioned digits by 3
                    dig1 = j * 3;
                    c += dig1;
                } else {
                    c += j;
                }
            }

            //finding the 12th digit
            d = c % 10; //finding the remainder
            if (d == 0) { //if there's no remainder
                System.out.println("The 12th digit is 0");
            } else { 
                f = 10 - d; //subtract 10 by the remainder to get the 12th digit (barcode numbers must add up to a multiple of 10) 
                System.out.println("The 12th digit is " + f);
            }
            System.out.println();
            lab13p1.repeat(args);
        } else { //exit program
            System.out.println("Bye");
        }
    }//main

    //repeat or quit program
    public static void repeat(String[] args) {
	    Scanner s = new Scanner(System.in);

        int answer = 0;
        int h;
        int x;
        boolean Error = true;
        String trash = "";

        System.out.println("Do you wanna try more numbers? Enter 1 for yes or 0 for no");
        for (x = 0;; x++) {
            try {
                h = s.nextInt();
                if (h == 1) {
                    lab13p1.main(args);
                    Error = true;
                    break;
                } else if (h == 0) {
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