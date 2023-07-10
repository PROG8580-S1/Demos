import java.util.*;

public class ExceptionExamples {

	public static void main(String[] args) {
		tryCatchExamples();

	}

	public static void tryCatchExamples() {
		Scanner input = new Scanner(System.in);
		int number1, number2, answer;

		try {
			System.out.print("Enter an integer (1-100): ");
			number1 = input.nextInt();
			
			if( number1 < 1 || number1 > 100) {
				throw new Exception("only values between 1-100");
			}

			System.out.print("Enter an integer (1-100): ");
			number2 = input.nextInt();

			if( number2 < 1 || number2 > 100) {
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
}
