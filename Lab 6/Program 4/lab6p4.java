import java.util.Scanner;

/**
 * lab6p4 class
 * @author Chelsea Li
 */
public class lab6p4 {
	/**
	 * Main class
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean error = false;
		double start = 0, rate = 0, amount = 0;
		int months = 0, years = 0;
		
		System.out.println("Enter the starting amount");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				start = s.nextDouble();
				error = true;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}
		
		System.out.println("Enter the interest rate in percentage");
		
		//Checking for invalid inputs
		while (error) {
			try {
				rate = s.nextDouble();
				error = false;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}
		
		System.out.println("Enter the number of months the interest is compounded");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				months = s.nextInt();
				
				if (months < 1) {
					System.out.println("Error: Positive integers only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
		
		System.out.println("Enter n number of years");
		
		//Checking for invalid inputs
		while (error) {
			try {
				years = s.nextInt();
				
				if (years < 1) {
					System.out.println("Error: Positive integers only");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
		
		//Calculating the amount in n years
		amount = start * Math.pow(rate / 100 / months + 1, years * months);
		
		System.out.println("The amount of money you'll have in " + years + " year(s) is $" + Math.round(amount * 100.0) / 100.0);
	}

}
