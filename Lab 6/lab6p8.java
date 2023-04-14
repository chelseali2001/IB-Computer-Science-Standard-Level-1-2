import java.util.Random;
import java.util.Scanner;

/**
 * lab6p8 class
 * @author Chelsea Li
 */
class lab6p8 {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean error = false;
		double results = 0;
		int darts = 0, total = 0;
		Random rand = new Random();
		
		System.out.println("Enter the number of darts you want to throw");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				darts = s.nextInt();
				
				if (darts < 1) {
					System.out.println("Error: Postitive integers only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
		
		//Finding the number of darts landing on a 90 degree circle sector of 1 unit radius
		for (int x = 0; x < darts; x++) {
			double a = rand.nextDouble();
			double b = rand.nextDouble();
			double c = (a * a) + (b * b);
			
			if (c <= 1) {
				total++;
			}
		}
		
		//Solving for pi
		results = 4.0 * (total / (double) darts);
		
		System.out.println("The value of pi is " + results);
	}
}
