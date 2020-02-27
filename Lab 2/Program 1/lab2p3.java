import java.util.Scanner;

/**
 * lab2p3 class
 * @author Chelsea Li
 */
class lab2p3 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter an integer to determine whether it's odd or even");

		boolean error = false;
		int num = 0;

		//Checking if the input is valid
		while (!error) {
			try {
				num = s.nextInt();
				error = true;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Integers only");
			}
		}

		//Determining whether or not the input is odd or even
		if (num == 0) {
		  System.out.println("Sorry 0 is neither even or odd");
		} else if (num % 2 == 0) {
		  System.out.println("even");
		} else {
		  System.out.println("odd");
		}
	}
}
