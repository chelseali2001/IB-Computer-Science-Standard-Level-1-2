import java.util.Scanner;

/**
 * lab2p5 class
 * @author Chelsea Li
 */
class lab2p5 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter a number");

		boolean error = false;    
		int i = 0;

		//Checking for invalid inputs
		while (!error) {
			try {
		    	i = s.nextInt();

			    error = true;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Integers only");
			}
		}

		String str = "" + i;
		char[] digit = str.toCharArray();

		//Splitting up the digits in the number
		for (char x : digit) {
			System.out.print(x + "   ");
		}

		System.out.println();
	}
}
