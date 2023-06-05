import java.util.Scanner;

public class MethodParameters {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, age;
		String userName, userPin;
		double inches;

//		System.out.print("Enter a number: ");
//		num1 = input.nextInt();
//
//		System.out.print("Enter a number: ");
//		num2 = input.nextInt();
//		
//		add(num1, num2);

//		System.out.print("Enter an age: ");
//		age = input.nextInt();
//		canVote(age);

//		System.out.print("Enter username: ");
//		userName = input.nextLine();
//
//		System.out.print("Enter PIN: ");
//		userPin = input.nextLine();
//
//		checkUser(userName, userPin);

//		System.out.print("Enter inches: ");
//		inches = input.nextDouble();
//
//		inchesToCm(inches);
		num1 = 10;
		num2 = 20;
		System.out.println("values before method: " + num1 + " "+ num2);
		switchValues(num1, num2);
		System.out.println("values after method: " + num1 + " "+ num2);

	}

	// addition method that takes 2 int parameters
	public static void add(int x, int y) {
		int sum;
		sum = x + y;

		System.out.println(x + " + " + y + " = " + sum);
	}

	// canVote method that takes in an int age parameter
	public static void canVote(int age) {
		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can't vote");
		}

	}

	// check user credentials (pin # 1234)

	public static void checkUser(String name, String pin) {
		if (pin.equals("1234")) {
			System.out.println("Welcome " + name);
		} else {
			System.out.println("Go away");
		}
	}

	// convert inches to cm (1 inch = 2.54cm)
	public static void inchesToCm(double inches) {
		double cm;
		cm = inches * 2.54;

		System.out.println(inches + "inches is " + cm + "cm");
	}

	public static void switchValues(int num1, int num2) {
		System.out.println("Method values before swap: " + num1 + " "+ num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Method values after swap: " + num1 + " "+ num2);
	}

	
	
	
	
	
	
	
	
}
