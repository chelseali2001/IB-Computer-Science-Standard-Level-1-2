import java.util.Scanner;

/**
 * lab1p4 class
 * @author Chelsea Li
 */
class lab1p4 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to my gas comsumption calculator machine");
		System.out.println("Please enter the starting milege, then the final mileage, then the amount of fuel it took to fill the tank.");

		double w, x, y, z;

		w = s.nextInt();
		x = s.nextInt();
		y = s.nextInt();
		z = (x - w) / y;

		//Checks for invalid numbers (if the amount of fuel is zero or if any of the inputs are a negative number)
		if (y == 0) {
		  System.out.println("Error");
		} else if (w <= -1) {
		  System.out.println("Error");
		} else if (x <= -1) {
		  System.out.println("Error");
		} else if (y <= -1) {
		  System.out.println("Error");
		} else if (z <= -1) {
		  System.out.println("Error");
		} else if ((w == 0) & (x == 0)) {
		  System.out.println("Error");
		} else {
		  System.out.println("The fuel consumption in miles-per-gallon is " + z);
		}
	}
}
