import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;
class lab7p2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a;
        int x;
        boolean Error = false;
        String trash = "";
        int num = 0;
        int total = 0;
        String ascii = "";
        String character = "";
        int newascii = 0;
            
        //reads user input
        System.out.println();
        System.out.println("Welcome to my acii number printer! Enter any character or enter x to exit");
        do {
            try {
                a = System.in.read();
                String extra = "";
                extra = Character.toString((char) a);
                if (extra.equalsIgnoreCase("\n")) {
                    Error = true;
                } else {
                    character += Character.toString((char) a) + " ";
                    num = num + 1;
                    if ((a > 47) && (a < 58)) {
                        total = total + 1;
                        ascii += (char) a;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid character"); 
            }
        } while (!Error);

        String[] dig = character.split(" ");

        if ((dig[0].equalsIgnoreCase("x")) && (num == 2)) {
            System.out.println("Bye");
            System.exit(0);
        } else {
            if (total >= 10) {
                System.out.println("Error: Number is too big");
                lab7p2.main(args);
            } else if (total == 0) {
                System.out.println("There's no numbers");
                lab7p2.repeat(args);
            }
            else {
                newascii = Integer.parseInt(ascii) * 2;
                System.out.println("The number you entered is " + ascii);
                System.out.println("Twice you number is " + newascii);
                lab7p2.repeat(args);
            }
        }
    } //main

    //repeat program
    public static void repeat(String args[]) {
        Scanner s = new Scanner(System.in);

        int b;
        int i;
        String trash = "";
        boolean Error = true;

        System.out.println("Do you want to enter more characters? Enter 1 for yes or 0 for no.");
        for (i = 0;; i++) {
            try {
                b = s.nextInt();
                if (b == 1) {
                    lab7p2.main(args);
                } else if (b == 0) {
                    System.out.println("Bye");
                    System.exit(0);
                } else {
                    System.out.println("Error: You must enter 1 or 0");
                }
            } catch (Exception e) {
                trash = s.next();
                System.out.println("Error: You must enter 1 or 0");
            }
        }
    }//repeat
}//num