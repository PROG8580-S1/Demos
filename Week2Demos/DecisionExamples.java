import java.util.Scanner;

public class DecisionExamples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int age, number1, number2;
		double hours, overtime;
		boolean socksOn, hatOn;
		String suit, day, category;

		// 1. determine if a person is old enough to vote.
		age = 17;

		if (age >= 18) {
			System.out.println("you can vote");
		} else {
			System.out.println("you can't vote");
		}

		// 2. Create a program that determines the max value between 2 values
		number1 = 16;
		number2 = 15;

		if (number1 > number2) {
			System.out.println(number1 + " > " + number2);
		} else {
			System.out.println(number1 + " < " + number2);
		}

		// 3. Check if both values are equal
		number1 = 8;
		number2 = 8;

		if (number1 == number2) {
			System.out.println(number1 + " = " + number2);
		} else {
			System.out.println(number1 + " NOT= " + number2);
		}

		// 4. Check if values are not equal to each other
		if (number1 != number2) {
			System.out.println(number1 + " != " + number2);
		}

		// 5. Determine overtime hours from user input
		System.out.println("Enter hours: ");
		hours = input.nextDouble();

		if (hours <= 40) {
			System.out.println("you worked " + hours + " hours");
		} else {
			overtime = hours - 40;
			System.out.println("you worked " + overtime + " overtime hours");
		}

		// 6. determine the colour of a card suit
		System.out.println("Enter suit: ");
		suit = input.next();

		if (suit.equalsIgnoreCase("clubs")) {
			System.out.println("suit is black");
		} else if (suit.equalsIgnoreCase("spades")) {
			System.out.println("suit is black");
		} else if (suit.equalsIgnoreCase("hearts")) {
			System.out.println("suit is red");
		} else if (suit.equalsIgnoreCase("diamonds")) {
			System.out.println("suit is red");
		} else {
			System.out.println("not a suit");
		}

		// 7. Do the same as above but use an OR statement

		if (suit.equalsIgnoreCase("clubs") || suit.equalsIgnoreCase("spades")) {
			System.out.println("suit is black");
		} else if (suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds")) {
			System.out.println("suit is red");
		} else {
			System.out.println("not a suit");
		}

		// 8. Use AND statements to see if two conditions are true
		socksOn = false;
		hatOn = true;

		if (socksOn == true && hatOn == true) {
			System.out.println("you are warm");
		} else if (!socksOn && hatOn) {
			System.out.println("your feet are cold");
		} else if (socksOn && !hatOn) {
			System.out.println("your head is chilly");
		} else {
			System.out.println("you are cold");
		}

		// 9. Determine hurricane wind speeds
		System.out.println("Enter category: ");
		category = input.next();

		switch (category) {
		case "1":
			System.out.println("119-153 km/hr");
			break;
		case "2":
			System.out.println("154-177 km/hr");
			break;
		case "3":
			System.out.println("178-209 km/hr");
			break;
		case "4":
			System.out.println("210-249 km/hr");
			break;
		case "5":
			System.out.println("greater than 249 km/hr");
			break;
		default:
        	System.out.println("not a category");
		}
		
		
        // 10. Determine if it's a weekday or weekend
		day = "Saturday";

		switch(day)
		{
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("It's a weekday");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("It's the weekend");
			break;
		}
	}

}
