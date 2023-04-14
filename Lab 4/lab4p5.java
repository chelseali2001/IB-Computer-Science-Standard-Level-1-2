import java.util.Scanner;

/**
 * lab4p5 class
 * @author Chelsea Li
 */
class lab4p5 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int first = 0, second = 0, lcm = 0, gcd = 0, max, min;
		boolean error = false;

		System.out.println("Welcome to my LCM/GCD calculator");
		System.out.println("Please enter the first number");

		//Checking for invalid inputs
		while (!error) {
			try {
				first = s.nextInt();
				error = true;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Integers only");
			}
		}

		System.out.println("Please enter the second number");

		//Checking for invalid inputs
		while (error) {
			try {
				second = s.nextInt();
				error = false;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Integers only");
			}
		}		

		//Determining which input is greater
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}

		//Finding the lcm of the two inputs
		while (!error) {
			if (max % first == 0 && max % second == 0) {
				lcm = max;
				error = true;
			}

			max++;
		}

		//Finding the gcd of the two inputs
		while (min > 0 && error) {
			if (first % min == 0 && second % min == 0) {
				gcd = min;
				error = false;
			}

			min--;
		}

		System.out.println("The LCM is " + lcm);
		System.out.println("The GCD is " + gcd);
	}
}
