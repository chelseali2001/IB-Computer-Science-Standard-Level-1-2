import java.util.Scanner;

/**
 * lab6p3 class
 * @author Chelsea Li
 */
class lab6p3 {
    /**
     * Main method
     * @param args
     */
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		
		boolean error = false;
		int input = 0;
		
		System.out.println("Enter a positive integer");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				input = s.nextInt();
				
				if (input < 0) {
					System.out.println("Error: Positive integers only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
		
		if (input == 0) {
			System.out.println("Fibonacci number #0 is 0");
		} else {
			System.out.println("Fibonacci number #" + input + " is " + fib(input));
		}
	}
	
    /**
     * Finds the corresponding fibonacci number
     * @param input
     */
	public static int fib(int input) {
		if (input <= 1) {
			return input;
		}
		
		return fib(input - 1) + fib(input - 2);
	}
}
