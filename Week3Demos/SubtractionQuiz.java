import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int counter = 0;
		int num1, num2, difference, userAnswer;

		while (counter < NUMBER_OF_QUESTIONS) {
			num1 = (int) (Math.random() * 10);
			num2 = (int) (Math.random() * 10);

			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			difference = num1 - num2;

			System.out.println("What is " + num1 + " - " + num2 + "?");
			userAnswer = input.nextInt();

			if (difference == userAnswer) {
				System.out.println("You got it!");
				correctCount++;
			} else {
				System.out.println("Oops. Not quite.");
			}

			counter++;
		}
		
		System.out.println("Great job. You got");
		System.out.println(correctCount + " correct!!!");


	}

}
