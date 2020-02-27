import java.util.Scanner;

/**
 * lab2p4 class
 * @author Chelsea Li
 */
class lab2p4 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter two numbers to determine if the first number is a multiple of the second");

		boolean error = false;
		int x = 0, y = 0;

		//Checking if input is valid
		while (!error) {
			try {
				x = s.nextInt();
				error = true;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Integers only");
			}
		}

		//Checking if input is valid
		while (error) {
			try {
				y = s.nextInt();
				error = false;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Integers only");
			}
		}

		//Determines whether or not the first input (x) is a multiple of the second input (y)
		if (y == 0) {
		  System.out.println(x + " can't be divided by 0");
		} else if (x % y == 0) {
		  System.out.println("The first number is a multiple of the second");
		} else {
		  System.out.println("The first number is not a multiple of the second");
		}
	}
}
