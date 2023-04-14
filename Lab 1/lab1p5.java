import java.util.Scanner;

/**
 * lab1p5 class
 * @author Chelsea Li
 */
class lab1p5 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);

	    System.out.println("Welcome to my shape creating machine!");
	    System.out.println("How long do you want the shapes to be?");

	    boolean error = false;
	    int length = 0;
	    int width = 0;
	    
	    //Checking for invalid values
	    while (!error) {
	    	try {
	    		length = s.nextInt();

	    		if (length < 0) {
	    			System.out.println("Please enter a number that's bigger than 0");
	    		} else {
	    			error = true;
	    		}
	    	} catch (Exception e) {
	    		String trash = s.next();
	    		System.out.println("No decimals or letters allowed");
	    	}
	    }

	    System.out.println("How wide do you want the shapes to be?");

	    //Checking for invalid values
	    while (error) {
	    	try {
	    		width = s.nextInt();

	    		if (width < 0) {
	    			System.out.println("Please enter a number that's bigger than 0");
	    		} else {
	    			error = false;
	    		}
	    	} catch (Exception e) {
	    		String trash = s.next();
	    		System.out.println("No decimals or letters allowed");
	    	}
	    }    

	    //Creating the rectangle
	    for (int x = 1; x <= length; x++){
			for (int i = 1; i <= width; i++) {
				System.out.print("*");
			}

			System.out.println();
	    }

	    System.out.print("\n");

	    //Creating the rombus
	    if (length % 2 == 0 && width % 2 == 0) {
	    	System.out.println("Unable to print rombous because the length and width are not odd");
	    } else {
	    	//Top half
	    	for (int x = 1; x < length; x += 2) {
				for (int i = 1; i < length - 1 - x / 2; i++) {
					System.out.print(" ");
				}

				for (int i = 0; i < x; i++) {
					System.out.print("*");
				}

				System.out.print("\n");
		    }
		    
		    //Bottom half
		    for (int x = length; x > 0; x -= 2) {
				for (int i = 1; i < length  - 1 - x / 2; i++) {
					System.out.print(" ");
				}

				for (int i = 0; i < x; i++) {
					System.out.print("*");
				}

				System.out.print("\n");
		    }
	    }

	    System.out.print("\n");

	    /**
	     * Creating the up arrow
		 * Top part
		 */
		for (int x = 0; x < width; x++) {
			for (int i = width; i > x; i--) {
			  System.out.print(" ");
			}

			for (int i = 1; i <= x + 1; i++) {
			  System.out.print(" *");
			}

			System.out.print("\n");
		}

		//Bottom part
		for (int x = 1; x < length; x++) {
			for (int i = 0; i <= width; i++) {
				System.out.print(" ");
			}

			for (int i = 1; i == 1; i++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.print("\n");
	}
}
