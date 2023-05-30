
public class ForLoops {

	public static void main(String[] args) {
		// 1. Create a loop that displays all values
		// inclusive between 1-5.

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " ");
		}

		// 2. Create a loop that displays all values
		// inclusive between 10-6.
		System.out.println();

		for (int i = 10; i >= 6; i--) {
			System.out.print(i + " ");
		}

		// 3. Create a loop that displays even
		// numbers inclusive between 2 and 10
		System.out.println();

		for (int i = 2; i <= 10; i = i + 2) { // i += 2
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		// 4. Create a loop that displays the sum of all numbers
		// inclusive between 1 and 10. The answers should be 55.

		System.out.println();

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

		// 5. Create a loop that displays all leap years inclusive between
		// 1990 and 2010. The output should be: 1992 1996 2000 2004 2008

		for (int year = 1990; year <= 2010; year++) {
			if (year % 4 == 0) {
				System.out.print(year + " ");
			}
		}

	}

}
