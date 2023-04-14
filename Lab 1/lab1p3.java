import java.util.Scanner;

/**
 * lab1p3 class
 * @author Chelsea Li
 */
class lab1p3 {
	/**
	* Main method
	* @param args
	*/
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to my circumference machine");
		System.out.println("Please enter the radius");

		boolean end = false;
		double radius = 0;

		//User must enter a positive number
		while (!end) {
		    try {
			radius = s.nextDouble();

			if (radius < 0) {
				System.out.println("Negative numbers are not allowed");
			} else {
				end = true;
			}
		    } catch (Exception e) {
			String trash = s.next();
			System.out.println("Negative numbers are not allowed");
		    }
		}

		//Solving for the circumference
		double circumference = radius * 2 * 3.14;

		System.out.println("The circumference of the circle is " + circumference);
	}
}
