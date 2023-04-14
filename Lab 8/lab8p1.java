import java.io.*;
import java.util.Random;
import java.util.Scanner;
class lab8p1 {
    public static void main(String [] args) {
        String grade;
        int grade1;
        int freshman = 0;
        int sophmores = 0;
        int juniors = 0;
        int seniors = 0;
        int boys = 0;
        int girls = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int stuff;
        String fileName = "classlist.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName); //picking the file to open
            BufferedReader bufferedReader = new BufferedReader(fileReader); //open file
            while((line = bufferedReader.readLine()) != null) { //reading each line
                int space = 0;
                for (stuff = 0; stuff < line.length(); stuff++) { //going through the line
                    grade = Character.toString(line.charAt(stuff));	//separate words from character to string
                    if (Character.isWhitespace(line.charAt(stuff))) {
                        space++;	//couting number of spaces
                    }
                    if (stuff == 8) {	//records grade level at eigth character
                        grade1 = Integer.parseInt(grade); //string to int
                        if (grade1 == 9) {
                            freshman++;	//number of freshman
                        } else if (grade1 == 0) {
                            sophmores++; //number of sophmores
                        } else if (grade1 == 1) {
                            juniors++; //number of juniors
                        } else if (grade1 == 2) {
                            seniors++; //number of seniors
                        }
                    }
                    if (space == 4) {	//records gender at the fourth space
                        if (line.charAt(stuff) == 'M') {
                            boys++; //number of boys
                        } else if (line.charAt(stuff) == 'F') {
                            girls++; //number of girls	
                        }
                    }
                    if (stuff == 10) {	//keeping track of the first letter of people's last names at the 10th character
                        //number of people with those letters at the beginning of their last name
                        if (line.charAt(stuff) == 'A') {
                            a++;
                        } else if (line.charAt(stuff) == 'B') {
                            b++;
                        } else if (line.charAt(stuff) == 'C') {
                            c++;
                        } else if (line.charAt(stuff) == 'D') {
                            d++;
                        } else if (line.charAt(stuff) == 'E') {
                            e++;
                        } else if (line.charAt(stuff) == 'F') {
                            f++;
                        } else if (line.charAt(stuff) == 'G') {
                            g++;
                        } else if (line.charAt(stuff) == 'H') {
                            h++;
                        } else if (line.charAt(stuff) == 'I') {
                            i++;
                        } else if (line.charAt(stuff) == 'J') {
                            j++;
                        } else if (line.charAt(stuff) == 'K') {
                            k++;
                        } else if (line.charAt(stuff) == 'L') {
                            l++;
                        } else if (line.charAt(stuff) == 'M') {
                            m++;
                        } else if (line.charAt(stuff) == 'N') {
                            n++;
                        } else if (line.charAt(stuff) == 'O') {
                            o++;
                        } else if (line.charAt(stuff) == 'P') {
                            p++;
                        } else if (line.charAt(stuff) == 'Q') {
                            q++;
                        } else if (line.charAt(stuff) == 'R') {
                            r++;
                        } else if (line.charAt(stuff) == 'S') {
                            s++;
                        } else if (line.charAt(stuff) == 'T') {
                            t++;
                        } else if (line.charAt(stuff) == 'U') {
                            u++;
                        } else if (line.charAt(stuff) == 'V') {
                            v++;
                        } else if (line.charAt(stuff) == 'W') {
                            w++;
                        } else if (line.charAt(stuff) == 'X') {
                            x++;
                        } else if (line.charAt(stuff) == 'Y') {
                            y++;
                        } else if (line.charAt(stuff) == 'Z') {
                            z++;
                        }
                    }
                }
            }   
            //output
            System.out.println();
            System.out.println("Freshman: " + freshman);
            System.out.println("Sophmores: " + sophmores);
            System.out.println("Juniors: " + juniors);
            System.out.println("Seniors: " + seniors);
            
            System.out.println();
            System.out.println("Boys: " + boys);
            System.out.println("Girls: " + girls);
            
            System.out.println();
            System.out.println("Last names beginning with:");
            System.out.println("A: " + a);
            System.out.println("B: " + b);
            System.out.println("C: " + c);
            System.out.println("D: " + d);
            System.out.println("E: " + e);
            System.out.println("F: " + f);
            System.out.println("G: " + g);
            System.out.println("H: " + h);
            System.out.println("I: " + i);
            System.out.println("J: " + j);
            System.out.println("K: " + k);
            System.out.println("L: " + l);
            System.out.println("M: " + m);
            System.out.println("N: " + n);
            System.out.println("O: " + o);
            System.out.println("P: " + p);
            System.out.println("Q: " + q);
            System.out.println("R: " + r);
            System.out.println("S: " + s);
            System.out.println("T: " + t);
            System.out.println("U: " + u);
            System.out.println("V: " + v);
            System.out.println("W: " + w);
            System.out.println("X: " + x);
            System.out.println("Y: " + y);
            System.out.println("Z: " + z);

            bufferedReader.close();         
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");	//if unable to open file              
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");	//if it can't read the file            
        }
    }//main
}//num