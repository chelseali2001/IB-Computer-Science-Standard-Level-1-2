import java.util.Scanner;

/**
 * lab6p7 class
 * @author chelsea
 */
class lab6p7 {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean error = false;
		int choose = 0, length = 0, width = 0;
		
		System.out.println("Enter 1 if you want to make a diamond or enter 2 if you want to make an X");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				choose = s.nextInt();
				
				if (choose != 1 & choose != 2) {
					System.out.println("Error: Enter 1 or 2");
				} else{
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Enter 1 or 2");
			}
		}
		
		System.out.println("Enter the length (odd numbers only)");
		
		//Checking for invalid inputs
		while (error) {
			try {
				length = s.nextInt();
				
				if (length < 1) {
					System.out.println("Error: Positive integers only");
				} else if (length % 2 == 0) { 
					System.out.println("Error: Odd integers only");
				} else {
					error = false;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
		
		System.out.println("Enter the width (odd numbers only)");
		
		//Checking for invalid inputs
		while (!error) {
			try {
				width = s.nextInt();
				
				if (width < 1) {
					System.out.println("Error: Positive integers only");
				} else if (width % 2 == 0) { 
					System.out.println("Error: Odd integers only");
				} else {
					error = true;
				}
			} catch (Exception e) {
				String trash = s.next();
				System.out.println("Error: Positive integers only");
			}
		}
	
		if (choose == 1) { //Making the diamond
			//Top half
			for (int x = 0; x < length / 2; x++) {
				for (int i = 0; i < width / 2 - x; i++) {
					System.out.print(" ");
				}
				
				for (int i = 0; i < width - ((width / 2 - x) * 2); i++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			//Middle
			for (int x = 0; x < width; x++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			//Bottom half
			for (int x = 1; x <= length / 2; x++) {
				for (int i = 0; i < x; i++) {
					System.out.print(" ");
				}
				
				for (int i = 0; i < width - (x * 2); i++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		} else { //Making an X
			//Top half
			for (int x = 0; x < length / 2; x++) {
				for (int i = 0; i < x; i++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for (int i = 0; i < width - (x * 2) - 2; i++) {
					System.out.print(" ");
				}
				
				System.out.println("*");
			}
			
			//Middle
			for (int x = 0; x < width / 2; x++) {
				System.out.print(" ");
			}
			
			System.out.println("*");
			
			//Bottom half
			for (int x = 0; x < length / 2; x++) {
				for (int i = 0; i < width / 2 - x - 1; i++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for (int i = 0; i < width - ((width / 2 - x) * 2); i++) {
					System.out.print(" ");
				}
				
				System.out.println("*");
			}
		}
	}
}
