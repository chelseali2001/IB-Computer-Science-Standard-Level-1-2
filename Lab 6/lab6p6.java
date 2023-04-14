import java.util.Scanner;

/**
 * lab6p6 class
 * @author Chelsea Li
 */
public class lab6p6 {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean error = false;
		int length = 0, width = 0;
		
		System.out.println("Enter the length of the pattern");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				length = s.nextInt();
				
				if (length < 1) {
					System.out.println("Error: Positive integers only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
		
		System.out.println("Enter the width of the pattern");
		
		//Checking for invalid inputs
		while (error) {
			try {
				width = s.nextInt();
				
				if (width < 1) {
					System.out.println("Error: Positive integers only");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
		
		//Creating the pattern
		for (int x = 1; x <= length; x++) {
			for (int i = 1; i <= width; i++) {
				if (x % 2 == 0) {
					if (i % 2 == 0) {
						System.out.print("0");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
