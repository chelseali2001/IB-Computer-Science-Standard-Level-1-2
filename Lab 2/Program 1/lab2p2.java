import java.util.Scanner;

/**
 * lab2p2 class
 * @author Chelsea Li
 */
class lab2p2 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to my score calculator!");

		boolean error = false;
		double score = 0, total = 0, grade;

		System.out.println("Please enter your score");

		//Checking for invalid inputs
		while (!error) {
			try {
				score = s.nextDouble();

				if (score < 0) {
					System.out.println("Error: You can't enter a negative number");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: You can't enter characters");
			}
		}

		System.out.println("Please enter the total score");

		//Checking for invalid inputs
		while (error) {
			try {
				total = s.nextDouble();

				if (total < 0) {
					System.out.println("Error: You can't enter a negative number");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: You can't enter characters");
			}
		}

		//Calculating the grade
		grade = (score * 100 / total);

		//Determining the letter grade
		if (grade < 60) {
			System.out.println("Your grade is " + grade + " which is a F");
		} else if (grade < 70) {
			System.out.println("Your grade is " + grade + " which is a D");
		} else if (grade < 80) {
			System.out.println("Your grade is " + grade + " which is a C");
		} else if (grade < 90) {
			System.out.println("Your grade is " + grade + " which is a B");
		} else {
			System.out.println("Your grade is " + grade + " which is a A");
		}
	}
}
