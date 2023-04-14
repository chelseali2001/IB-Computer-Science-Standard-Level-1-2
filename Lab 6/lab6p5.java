import java.util.Scanner;

/**
 * lab6p5 class
 * @author Chelsea Li
 */
class lab6p5 {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		boolean error = false;
		double start = 0, save = 0, rate = 0, amount = 0, years = 0;
		
		System.out.println("Welcome to my interest rate calculator!");
		
		System.out.println("Please enter the starting amount of cash.");
		
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
		
		System.out.println("Please enter the amount of money you want to save each month.");
		
		//Checking for invalid inputs
		while (error) {
			try {
				save = s.nextDouble();
				
				if (save < 0) {
					System.out.println("Error: Positive numbers only");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}
		
		System.out.println("Please enter the interest rate in percent.");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				rate = s.nextDouble();
				error = true;
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}
		
		System.out.println("In how many years do you want to see how much money you've saved up.");
		
		//Checking for invalid inputs
		while (error) {
			try {
				year = s.nextDouble();
				
				if (year < 0) {
					System.out.println("Error: Positive numbers only");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Numbers only");
			}
		}
		
		rate = rate / 100 / 12 + 1;
		amount = Math.round(Math.pow(rate, year * 12) * start * 100.0) / 100.0; //Amount of money without the monthly deposit
		
		System.out.println("The amount of money in " + year + " year(s) is " + amount + " if you did not do your monthly deposit");
		
		amount = Math.round(amount + (save * ((Math.pow(rate, 30 * 12) - 1) / (rate - 1))) * 100.0) / 100.0; //Amount of money with the monthly deposit
		
		System.out.println("The amount of money in " + year + " year(s) is " + amount + " if you did do your monthly deposit");		
	}
}
