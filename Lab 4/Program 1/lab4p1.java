import java.math.BigInteger;
import java.util.Scanner;

/**
 * lab4p1 class
 * @author Chelsea Li
 */
class lab4p1 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int usernumber = 0;
		BigInteger counter = BigInteger.valueOf(0);
		boolean error = false;

		System.out.println("Please enter a positive integer");

		//Checking for invalid inputs
		while (!error) {
			try {
				usernumber = s.nextInt();

				if (usernumber < 1) {
					System.out.println("Error: Positive integer only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integer only");
			}
		}

		System.out.print("0");

		//Adding up and printing out the numbers starting from 1 up till the usernumber value
		for (int x = 1; x <= usernumber; x++) {
			System.out.print(" + " + x);
			counter = counter.add(BigInteger.valueOf(x));
		}

		System.out.println(" = " + counter);
	}
}
