/**
 * lab6p9 class
 * @author Chelsea Li
 */
class lab6p9 {
	public static void main(String[] args) {
		String tails = "";

		//Printing out the coin index
		for (int x = 1; x <= 10; x++) {
			System.out.print("1234567890");
		}

		System.out.println();

		/**
		 * Determining whether the coins will end up being heads or tails
		 * The coins will be flipped depending on whether or not their indexes are multiples of n
		 * Numbers 1-100 will be tested
		 */
		for (int x = 1; x <= 100; x++) {
			int a = 0;
			
			for (int i = 1; i <= 100; i++) {
				if (x % i == 0) {
					a++;
				}
			}
			
			int b = a % 2;
			
			if (b == 0) {
				System.out.print("H");
			} else {
				System.out.print("T");
				tails += x + " ";
			}
		}

		System.out.println();
		
		//Printing out the coins with tails
		System.out.println(tails);
	}
}
