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
	}

}
