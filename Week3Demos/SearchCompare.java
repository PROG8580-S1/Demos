import java.util.Scanner;

public class SearchCompare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String testString, testString2, firstName, lastName;
		int index, compareValue;

		// 1. Find a part of a string
		System.out.println("Enter your course code: ");
		testString = input.nextLine();

		System.out.println(testString.length());
		System.out.println(testString.charAt(testString.length() - 1));

		if (testString.contains("PROG")) {
			System.out.println("Programming Course");
		} else {
			System.out.println("Not a programming Course");
		}

		index = testString.indexOf("P");

		if (index >= 0) {
			System.out.println("At index: " + index);
		} else {
			System.out.println("Not found");
		}

		testString = "xx oo xx oo xx";

		index = testString.indexOf("xx");
		System.out.println("At index: " + index);

		index = testString.indexOf("xx", 3);
		System.out.println("At index: " + index);

		index = testString.lastIndexOf("xx");
		System.out.println("At index: " + index);

		// 2. Use substrings to split a name
		testString = "Aristeides Theo";

		index = testString.indexOf(' ');

		firstName = testString.substring(0, index);
		System.out.println(firstName);

		lastName = testString.substring(index + 1);
		System.out.println(lastName);

		// 3. Compare two strings

		testString = "Waterloo";
		testString2 = "Toronto";

		System.out.println();

		if (testString.equalsIgnoreCase(testString2)) {
			System.out.println("Same city");
		} else {
			System.out.println("Different city");
		}

		compareValue = testString.compareTo(testString2);

		System.out.println(compareValue);

		if (compareValue < 0) {
			System.out.println(testString + " " + testString2);
		} else if (compareValue > 0) {
			System.out.println(testString2 + " " + testString);
		} else {
			System.out.println("same city");
		}

	}

}
