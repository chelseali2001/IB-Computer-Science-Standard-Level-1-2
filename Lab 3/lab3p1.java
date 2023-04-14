import java.util.Scanner;

/**
 * lab3p1 class
 * @author Chelsea Li
 */
class lab3p1 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		boolean error = false;
		double a = 0, b = 0, c = 0;

		System.out.println("Please enter the value of A in the quadratic formula");

		//Checking for invalid inputs
		while (!error) {
			try {
				a = s.nextDouble();

				if (a == 0) {
					System.out.println("Error: A can't equal 0");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}

		System.out.println("Please enter the value of B in the quadratic formula");

		//Checking for invalid inputs
		while (error) {
			try {
				b = s.nextDouble();
				error = false;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}

		System.out.println("Please enter the value of C in the quadratic formula");

		//Checking for invalid inputs
		while (!error) {
			try {
				c = s.nextDouble();
				error = true;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}

		//Solving for the discriminant
		double discriminant = (b * b) - (4 * a * c);

		//Finding the roots
		if (discriminant < 0) { //If the root is imaginary
			System.out.println("Root 1 = " + (-b / (2 * a)) + " + " + (Math.sqrt(-discriminant) / (2 * a)) + "i");
			System.out.println("Root 2 = " + (-b / (2 * a)) + " - " + (Math.sqrt(-discriminant) / (2 * a)) + "i");
		} else { //If the root is real
			System.out.println("Root 1 = " + ((-b + Math.sqrt(discriminant)) / (2 * a)));
			System.out.println("Root 2 = " + ((-b - Math.sqrt(discriminant)) / (2 * a)));
		}
	}
}
