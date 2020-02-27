import java.util.Scanner;

/**
 * lab1p2 class
 * @author Chelsea Li
 */
class lab1p2 {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to my adding, subtracting, multiplying, dividing machine");
		System.out.println("Please enter two numbers");

		double a, b, c, d, x, y;

		//The sum, difference, product, and quotient of two inputs
		x = s.nextDouble();
		y = s.nextDouble();
		a = x + y;
		b = x - y;
		c = x * y;
		d = x / y;

		if ((x == 0) & (y == 0)) { //If both inputs equal zero
		  System.out.println("The sum, difference, product, quotient is " + a + " , " + b + " , " + c + ", error");
		} else if (y == 0) { //If the second input is zero
		  System.out.println("The sum, difference, product, quotient is " + a + " , " + b + " , " + c + ", " + x + " divided by 0 is an error");
		} else if (x == 0) { //If the first input is zero
		  System.out.println("The sum, difference, product, quotient is " + a + " , " + b + " , " + c + ", 0.0");
		} else {
		  System.out.println("The sum, difference, product, quotient is " + a + ", " + b + ", " + c + ", and " + d);
		}
	}
}
