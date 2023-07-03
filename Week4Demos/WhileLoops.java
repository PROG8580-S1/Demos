import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1. counting to 10 with a while loop
		int counter = 1;

		while (counter <= 10) {
			System.out.println(counter + " ");
			counter++;
		}
		int x = 1;
		
//	    while ((0 < x) && (x < 100)) {
//	    	System.out.println(x);
//	    	x++;
//	    }
	    
	    if( x == 2)
	    	System.out.println(x);
    		System.out.println(4);

	    // 2. counting program
		System.out.println();

		boolean keepGoing = true;
		String userChoice;
		counter = 0;

		while (keepGoing) {
			System.out.print("Do you want to count? (y/n)");
			userChoice = input.nextLine();

			if (userChoice.equals("y")) {
				counter++;
				System.out.println(counter);
			} else if (userChoice.equals("n")) {
				keepGoing = false;
			} else {
				System.out.println("ERROR: only y or n");
			}
		}
		System.out.println("Bye");

		// 3. addition game
		
		int num1, num2, sum, userAnswer;
		
		num1 = (int)(Math.random() * 10);
		num2 = (int)(Math.random() * 10);
		sum = num1 + num2;
		
		System.out.println("What is " + num1 + " + " + num2 + "?");
		userAnswer = input.nextInt();
		
		while (sum != userAnswer)
		{
			System.out.println("Wrong answer. Try again.");
			System.out.println("What is " + num1 + " + " + num2 + "?");
			userAnswer = input.nextInt();
		}
		
		System.out.println("You got it!!!!");

	}

}
