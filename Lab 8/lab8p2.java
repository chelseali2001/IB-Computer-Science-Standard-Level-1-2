import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
class lab8p2 {
    public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);

        int answer;
        int repeat;
        int stuff;
        int i;
        int k;
        int t;
        int x;
        boolean Error = true;
        String trash = "";
        String fileName = "classlist.txt";
        String fileName2 = "classlist.txt";
        String line = null;
        String line1 = null;
        String fileName1 = "classlist.txt";
        String fileName3 = "classlist.txt";
        String tmp;

        for (x = 0;; x++) {
            int asdf = 0;
            System.out.println("Enter 0 if you want to sort by the student's last name, enter 1 if you want to sort by the student's ID number, or enter 2 to exit."); 
            String string3 = "";
            try {
                answer = s.nextInt();
                if (answer == 0) { //orgainzing student's last names
                    System.out.println();
                    try {
                        FileReader fileReader = new FileReader(fileName); //picking file
                        BufferedReader bufferedReader = new BufferedReader(fileReader);	//read file
                        while((line = bufferedReader.readLine()) != null) { //reading each line
                            int space = 0;
                            String string = "";
                            String string1 = "";
                            String string2 = "";
                            for (stuff = 0; stuff < line.length(); stuff++) {	//going through the line
                                string = Character.toString(line.charAt(stuff)); //char to string
                                if (Character.isWhitespace(line.charAt(stuff))) { 
                                    space++; //keeps track of the number of spaces
                                }
                                if (space == 3) {
                                    string2 += string1 + " "; //to form a word
                                    break;
                                } else if (stuff > 9) {
                                    string1 += string; //add characters together
                                }
                            }
                            string3 += string2; //in order to print outside the loop
                        }
                        //alphabetizing last names
                        String[] str = string3.split(" ");
                        for (i = 0; i < str.length; i++) {
                            tmp = str[i];
                            for (k = 0; k < str.length; k++) {
                                if (i == k) continue;
                                t = tmp.compareTo(str[k]);
                                if (t < 0) {
                                    tmp = str[k];
                                    str[k] = str[i];
                                    str [i] = tmp;
                                }
                            }
                        }	
                        FileInputStream fileReader1 = new FileInputStream(fileName2); //open same file
                        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(fileReader1));
                        String g = "";
                        for (i = 0; i < str.length; i++) {//the words in order
                            while ((line1 = bufferedReader1.readLine()) != null){ //one line at a time
                                int space1 = 0;
                                String string4 = "";
                                String string5 = "";
                                String num = "";
                                String other = "";
                                String y = "";
                                for (stuff = 0; stuff < line1.length(); stuff++) { //one letter at a time
                                    string4 = Character.toString(line1.charAt(stuff));//each letter
                                    if (Character.isWhitespace(line1.charAt(stuff))) {
                                        space1++;
                                    }
                                    if ((stuff >= 0) && (stuff <= 9)) {
                                        num += string4;
                                    }
                                    if ((stuff > 9) && (space1 < 3)) {
                                        string5 += string4; //to form the last name
                                    }
                                    if ((space1 >= 3) && (space1 < 5)) {
                                        other += string4;
                                    }
                                    if (space1 == 5) {
                                        break;
                                    }
                                }
                                if (str[i].equals(string5)) {
                                    y = num + string5 + other + "\r\n";
                                    g += y;
                                    break;
                                }
                            }
                            fileReader1.getChannel().position(0); //repeat file
                        }
                        try (FileWriter fw = new FileWriter("classlist_by_name.txt")) {
                            fw.write(g);
                        } catch (IOException z) {
                            System.out.println("Error");
                        }
                        //create file
                        System.out.println("Check your files");
                        bufferedReader.close(); 
                        bufferedReader1.close(); 
                    } catch(FileNotFoundException ex) {
                        System.out.println("Unable to open file '" + fileName + "'");                
                    } catch(IOException ex) {
                        System.out.println("Error reading file '" + fileName + "'");                  
                    }
                } else if (answer == 1) {
                    System.out.println();
                    try {
                        FileReader fileReader = new FileReader(fileName1); //open file
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String d = "";
                        while((line = bufferedReader.readLine()) != null) {
                            int sp = 0;
                            String a = "";
                            String b = "";
                            String c = "";
                            for (stuff = 0; stuff < line.length(); stuff++) {
                                a = Character.toString(line.charAt(stuff)); //char to string
                                if (Character.isWhitespace(line.charAt(stuff))) {
                                    sp++;
                                }
                                if (sp < 1) {
                                    b += a;
                                }
                                if (sp == 1) {
                                    c += b + " ";
                                    break;
                                }
                            }
                            d += c;
                        }   
                        //sorting by id number
                        String[] f = d.split(" ");
                        Arrays.sort(f);
                        FileInputStream fileReader1 = new FileInputStream(fileName3);
                        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(fileReader1));
                        String w = "";
                        for (i = 0; i < f.length; i++) {//the words in order
                            while ((line1 = bufferedReader1.readLine()) != null){ //one line at a time
                                int sp1 = 0;
                                String g = "";
                                String h = "";
                                String j = "";
                                String q = "";
                                for (stuff = 0; stuff < line1.length(); stuff++) {
                                    g = Character.toString(line1.charAt(stuff));//each letter
                                    if (Character.isWhitespace(line1.charAt(stuff))) {
                                        sp1++;
                                    }
                                    if (sp1 == 5) {
                                        break;
                                    }
                                    if (stuff <= 5) {
                                        h += g;
                                    }
                                    if (stuff >= 7) {
                                        j += g;
                                    }
                                }
                                if (f[i].equals(h)) {
                                    q = h + " " + j;
                                    w += q + "\r\n";
                                    break;
                                }
                            }
                            fileReader1.getChannel().position(0); //repeat file
                        }
                        //create file
                        try (FileWriter fw1 = new FileWriter("classlist_by_id.txt")) {
                            fw1.write(w);
                        } catch (IOException r) {
                            System.out.println("Error");
                        }
                        System.out.println("Check your files");
                        bufferedReader.close();   
                        bufferedReader1.close(); 
                    } catch(FileNotFoundException ex) {
                        System.out.println("Unable to open file '" + fileName + "'");                
                    } catch(IOException ex) {
                        System.out.println("Error reading file '" + fileName + "'");                  
                    }
                } else if (answer == 2) {
                    System.out.println("Bye");
                    Error = true;
                    break;
                } else {
                    System.out.println("Error: You have to enter 0, 1, or 2");
                    continue;
                }
                System.out.println();
                System.out.println("Do you want to sort it in a different way? Enter 1 for yes or 0 for no.");
                for (k = 0;; k++) {
                    try {
                        repeat = s.nextInt();
                        if (repeat == 1) {
                            Error = true;
                            break;
                        } else if (repeat == 0) {
                            System.out.println("Bye");
                            System.exit(0);
                        } else {
                            System.out.println("Error: You must enter 1 or 0");
                            continue;					}
                    } catch (Exception e) {
                        trash = s.next();
                        System.out.println("Error: You must enter 1 or 0");
                    }
                }
            } catch (Exception e) {
                trash = s.next();
                System.out.println("Error: You have to enter 0, 1, or 2");
            }
        }
    } //main
}//num