import java.util.Scanner;

public class TImeCalculate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//variables
		int seconds;
		int minutes;
		int remainingSeconds;
		
		//inputs
		System.out.println("Enter total seconds:");
		seconds = input.nextInt();
		
		//Find the minutes
		minutes = seconds / 60;
		
		//Find the remaining seconds
		remainingSeconds = seconds % 60;
		
		//output results
		System.out.println(seconds + "s is " + minutes +
				"m and " + remainingSeconds + "s");
		
	}

}
