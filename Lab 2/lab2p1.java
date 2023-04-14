import java.util.Scanner;

/**
 * lab2p1 class
 * @author Chelsea Li
 */
class lab2p1 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		 
		System.out.println("Welcome to my BMI calculator!");
		System.out.println("Please enter your weight in pounds");

		boolean error = false;
		double weight = 0;
		double height = 0;

		//Checking for invalid inputs
		while (!error) {
			try {
				weight = s.nextDouble();

				if (weight <= 0) {
					System.out.println("Error: You can't enter 0 or a negative number");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Enter a number");
			}
		}

		System.out.println("Please enter your height in inches");

		//Checking for invalid inputs
		while (error) {
			try {
				height = s.nextDouble();

				if (height < 0) {
					System.out.println("Error: You can't enter 0 or a negative number");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Enter a number");
			}
		}

		//Finding your bmi
		double bmi = (weight * 703) / (height * height);

		if (bmi < 18.5) {
			System.out.println("Your bmi is " + bmi + " You are underweight");
		} else if (bmi <= 25) {
			System.out.println("Your bmi is " + bmi + " You are normal");
		} else if (bmi <= 30) {
			System.out.println("Your bmi is " + bmi + " You are overweight");
		} else {
			System.out.println("Your bmi is " + bmi + " You are obese");
		}
	}
}
