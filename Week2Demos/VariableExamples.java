
public class VariableExamples {

	public static void main(String[] args) {
		// 1. Declare a string variable, put your name in it, display it
		String firstName = "Tony";
		System.out.println("Hello " + firstName);

		// 2. Declare an integer variable, put your age in it, display it
		int age = 23;
		System.out.println(age);

		// 3. Declare a double, put a value in it, display it
		double taxRate = 0.14;
		System.out.println(taxRate);

		// 4. Adding, subtract, multiply, and divide numbers
		int x = 9;
		int y = 2;
		int answer;

		answer = x + y;
		System.out.println(x + " + " + y + " = " + answer);

		answer = x - y;
		System.out.println(x + " - " + y + " = " + answer);

		answer = x * y;
		System.out.println(x + " * " + y + " = " + answer);

		answer = x / y;
		System.out.println(x + " / " + y + " = " + answer);

		answer = x % y;
		System.out.println(x + " % " + y + " = " + answer);

		double doubleValue = 2.0;
		double doubleAnswer = x / doubleValue;
		System.out.println(x + " / " + doubleValue + " = " + doubleAnswer);

		// 5. Increment your age by 1
		age++; // age = age + 1;
		System.out.println(age);

		// 6. Decrement your age by 1
		age--;
		System.out.println(age);

		// 7. Exponents
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(4, 0.5));
		System.out.println(Math.pow(2.5, 2));
		System.out.println(Math.pow(2.5, -2));

	}

}
