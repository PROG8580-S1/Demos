import java.util.Scanner;

public class MethodExamples {

	// created globally for use in any method within class
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("1");
//		printSignature();
//		System.out.println("2");
//		add();
		findMax();
	}

	// print a name to the screen
	public static void printSignature() {
		System.out.println("Your's truly \nGrace Hopper");
	}

	// add 2 values given by the user
	public static void add() {
		int num1, num2, sum;

		System.out.print("Enter a number: ");
		num1 = input.nextInt();

		System.out.print("Enter a number: ");
		num2 = input.nextInt();

		sum = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

	// determine the max of three numbers input by user
	public static void findMax() {
		int num1, num2, num3, max;

		num1 = 6;
		num2 = 5;
		num3 = 11;

		long startTime = System.currentTimeMillis();
		long endTime, testTime;

		for (int i = 0; i < 1000000000; i++) {
			for (int j = 0; j < 1000000000; j++) {
				max = num1;
				
				if (num2 > max) {
					max = num2;
				}
				
				if (num3 > max) {
					max = num3;
				}
			}
		}
		endTime = System.currentTimeMillis();
		testTime = endTime - startTime;
		System.out.println(testTime);
	}

	public static void maxEfficiency() {

	}
	
	
}
