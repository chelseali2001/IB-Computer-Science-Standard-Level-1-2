import java.util.ArrayList;
import java.util.Scanner;

/**
 * lab4p4 class
 * @author Chelsea Li
 */
class lab4p4 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		ArrayList<Integer> inputs = new ArrayList<Integer>();
		int in = 0, counter = 0, num = 0;
		boolean error = false, error1 = false, error2 = false;
		double decimalTotal = 0, numSum = 0, denSum = 1;

		System.out.println("How many integers do you want to enter?");

		//Checking for invalid inputs
		while (!error) {
			try {
				in = s.nextInt();

				if (in < 1) {
					System.out.println("Error: Positive integers only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}

		s.nextLine();

		System.out.println("Enter " + in + " numbers");

		//Checking for invalid inputs
		while (counter < in && error) {
			try {
				inputs.add(s.nextInt());

				//If the user wants to stop entering numbers or accidentally entered 0
				if (inputs.get(counter) == 0) {
					System.out.println("Enter 1 to continue or 2 to stop.");

					while (!error1) {
						try {
							num = s.nextInt();

							if (num != 1 && num != 2) {
								System.out.println("Error: Enter 1 or 2");
							} else if (num == 1) {
								error1 = true;
								inputs.remove(counter);
								counter--;
							} else if (num == 2) {
								error1 = true;
								error = false;
							}
						} catch (Exception e) {
							String trash = s.next();
							System.out.println("Error: Enter 1 or 2");
						}
					}

					error1 = false;
				}

				counter++;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Integers only");
			}
		}

		/**
		 * Finding the sum of the recipricals in decimal form
		 * Finding the sum of the numerators of the reciprocals in fraction form
		 * Finding the sum of the denominators of the reciprocals in fraction form
		 */
		for (int x = 0; x < inputs.size(); x++) {
			decimalTotal += 1 / Double.valueOf(inputs.get(x));
			denSum *= inputs.get(x);

			int prod = 1; 

			for (int i = 0; i < inputs.size(); i++) {
				if (i != x) {
					prod *= inputs.get(i);
				}
			}

			numSum += prod;
		}

		counter = (int) denSum;

		//Simplyfing the fraction form of the sum of the recipricals
		while (counter > 0 && !error2) {
			if (numSum % counter == 0 && denSum % counter == 0) {
				error2 = true;
			} else {
				counter--;
			}
		}

		numSum = numSum / counter;
		denSum = denSum / counter;

		System.out.println("The sum of the recipricals (in decimal form) is " + decimalTotal);

		if (denSum == 1) { //If the denominator equals 1
			System.out.println("The sum of the recipricals (in fraction form) is " + (int) numSum);
		} else {
			System.out.println("The sum of the recipricals (in fraction form) is " + (int) numSum + "/" + (int) denSum);
		}
	}
}
