import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class lab7p1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a;
        int x;
        boolean Error = false;
        String trash = "";
        int num = 0;
        String ascii = "";
        String character = "";
            
        System.out.println("Welcome to my acii number printer! Enter any character or enter x to exit");
        //reads user input
        do {
            try {
                a = System.in.read();
                String extra = "";
                extra = Character.toString((char) a);
                if (extra.equalsIgnoreCase("\n")) { //end of input
                    Error = true;
                } else {//keeps track of ascii codes and characters
                    ascii += Integer.toString(a) + " ";
                    character += Character.toString((char) a) + " ";
                    num = num + 1;
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid character"); 
            }
        } while (!Error);

        String[] digits = ascii.split(" ");
        String[] dig = character.split(" ");

        if ((dig[0].equalsIgnoreCase("x")) && (num == 2)) { //exit
            System.out.println("Bye");
            System.exit(0);
        } else { //if user doesn't want to exit
            for (x = 0; x < num - 1; x++) {
                System.out.println("You entered this byte >" + digits[x] + "< which is this char >" + dig[x] + "<");
            }
        }

        System.out.println(); 
        lab7p1.repeat(args);
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
                    lab7p1.main(args);
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