import java.util.*;

public class ExceptionExamples {

	public static int id;
	public static int pin;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		tryCatchExamples();
//		MethodExceptions();
		MethodExceptions2();
	}

	public static void tryCatchExamples() {
		int number1, number2, answer;

		try {
			System.out.print("Enter an integer (1-100): ");
			number1 = input.nextInt();

			if (number1 < 1 || number1 > 100) {
				throw new Exception("only values between 1-100");
			}

			System.out.print("Enter an integer (1-100): ");
			number2 = input.nextInt();

			if (number2 < 1 || number2 > 100) {
				throw new Exception("only values between 1-100");
			}

			answer = number1 / number2;
			System.out.println(answer);

		} catch (InputMismatchException ex) {
			System.out.println("Only integer inputs");
		} catch (ArithmeticException ex) {
			System.out.println("Can't divide by 0");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("\ncode in finally block");
		}

		System.out.println("\nEND OF PROGRAM");

	}

	public static void MethodExceptions() {
		// create a person with valid and invalid age
		try {
			Person person = new Person("Tony", -23);
			System.out.println("Name: " + person.getName());
			System.out.println("Age: " + person.getAge());
		} catch (InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void MethodExceptions2() {
		try {
			System.out.print("Enter ID: ");
			id = input.nextInt();

			idCheck(id);
		} catch (Exception ex) {
			pin = 0;
			id = 0;
			System.out.println("\n" + ex.getMessage());
			System.out.println("Login failed");
		}
		System.out.println("\nID: " + id);
		System.out.println("PIN: " + pin);
	}

	public static void idCheck(int userID) throws Exception {
//		try {
			if (userID != 11) {
				throw new Exception("Invalid ID");
			} else {
				System.out.println("ID ok");
				System.out.print("Enter PIN: ");
				pin = input.nextInt();

				pinCheck(pin);
			}
//		} catch (Exception ex) {
//			throw ex;
//		}

		System.out.println("idcheck done");
	}

	public static void pinCheck(int userPin) throws Exception {
		//try {
			if (userPin != 1234) {
				throw new Exception("Invalid PIN");
			} else {
				System.out.println("PIN ok");
			}
//		} catch (Exception ex) {
//			throw ex;
//		} finally {
//			System.out.println("pincheck done");
//		}
	}

}
