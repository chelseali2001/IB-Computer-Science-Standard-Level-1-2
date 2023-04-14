import java.util.Scanner;

/**
 * lab3p2 class
 * @author Chelsea Li
 */
class lab3p2 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to my pythagorean calculator!");

		boolean error = false;
		double a = 0, b = 0, c = 0, d;

		System.out.println("Please enter the value of the shorter side of the triangle or enter -1 as the unknown side");

		//Checking for invalid inputs
		while (!error) {
			try {
				a = s.nextDouble();

				if (a == 0 || a < -11) {
					System.out.println("Error: Positive numbers only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}

		System.out.println("Please enter the value of the longer side of the triangle or enter -1 as the unknown side");

		//Checking for invalid inputs
		while (error) {
			try {
				b = s.nextDouble();

				if (b == 0 || b < -1) {
					System.out.println("Error: Positive numbers only");
				} else if (b == -1 && a == -1) {
					System.out.println("Error: There's already an unknown side");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}

		//If the unknown side has been indicated
		if (a == -1 || b == -1) {
			System.out.println("Please enter the value of the hypotenuse of the triangle or enter -1 as the unknown side");

			//Checking for invalid inputs
			while (!error) {
				try {
					c = s.nextDouble();

					if (c == 0 || c < -1) {
						System.out.println("Error: Positive numbers only");
					} else if (c == -1 && (a == -1 || b == -1)){
						System.out.println("Error: There's already an unknown side");
					} else {
						error = true;
					}
				} catch (Exception e) {
					String trash = s.next();
					System.out.println("Error: Numbers only");
				}
			}
		}

		//Finding the unknown side
		if (a == -1) { //If the shorter side is unknown
			d = Math.sqrt((c * c) - (b * b));
		} else if (b == -1) { //If the longer side is unknown
			d = Math.sqrt((c * c) - (a * a));
		} else { //If the hypotenuse is unknown
			d = Math.sqrt((a * a) + (b * b));
		}

		System.out.println("The unknown side is " + d);

		//Finding the angles in degrees
		double anglea = Math.toDegrees(Math.asin(a / d)); 
		double angleb = Math.toDegrees(Math.asin(b / d));
		double anglec = 180.0 - (anglea + angleb);

		double rad = 3.14 / 180;

		System.out.println("The angles (in degrees) are " + anglea + ", " + angleb + ", " + anglec); 

		//Finding the angles in radians
		System.out.println("The angles (in radians) are " + (anglea * rad) + ", " + (angleb * rad) + ", " + (anglec * rad)); 
	}
}
