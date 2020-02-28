import java.util.Scanner;

/**
 * lab4p3 class
 * @author Chelsea Li
 */
class lab4p3 {
    /**
     * Main method
     * @param args
     */
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("Let's see how many people got and A!");
		System.out.println("How many scores are there?");

		int total = s.nextInt(); //Total number of scores

		System.out.println("Enter the scores");

		double[] scores = new double[total];
		int a = 0, b = 0, c = 0, d = 0, f = 0, sum = 0;

		s.nextLine();

		//Entering the scores
		for (int x = 0; x < total; x++) {
			scores[x] = s.nextDouble();
			sum += scores[x]; //Adding up the scores

			//Keeping track of the number of people who go A's, B's, C's, D's, and F's
			if (scores[x] < 60) {
				f++;
			} else if (scores[x] < 70) {
				d++;
			} else if (scores[x] < 80) {
				c++;
			} else if (scores[x] < 90) {
				b++;
			} else {
				a++;
			}
		}

		double average = sum / total; //Finding the average

		System.out.println();

		//Stating the number of people who got which grade
		System.out.println(a + " person(s) got an A");
		System.out.println(b + " person(s) got a B");
		System.out.println(c + " person(s) got a C");
		System.out.println(d + " person(s) got a D");
		System.out.println(f + " person(s) got a F");

		//Stating the class average and the letter grade
		if (average < 60) {
			System.out.println("The class average is " + average + " which is a F");
		} else if (average < 70) {
			System.out.println("The class average is " + average + " which is a D");
		} else if (average < 80) {
			System.out.println("The class average is " + average + " which is a C");
		} else if (average < 90) {
			System.out.println("The class average is " + average + " which is a B");
		} else {
			System.out.println("The class average is " + average + " which is an A");
		}
	}
}
