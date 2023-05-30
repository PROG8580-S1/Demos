import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//  Counting with do while
		
		int startingNumber = 1;
		
		do {
			System.out.print(startingNumber + " ");
			startingNumber++;
		}while(startingNumber <=10);
		
		
		// Create a program menu
		String userChoice;
		int length, width, area;
		
		System.out.println();
		
		do {
			System.out.println("Please select an option");
			System.out.println("1. Display values between 1-5");
			System.out.println("2. Find area of a Rectangle");
			System.out.println("3. Exit");
			userChoice = input.next();
			
			if (userChoice.equals("1")) {
				for(int i = 1; i <= 5; i++)
				{
					System.out.print(i + " ");
				}
			}else if (userChoice.equals("2")) {
				System.out.println("Please enter length: ");
				length = input.nextInt();

				System.out.println("Please enter width: ");
				width = input.nextInt();
				
				area = length * width;
				System.out.println("area = " + area + "units^2");
			} else {
				System.out.println("Please enter only values between 1-3");
			}
				
			
			System.out.println();

		}while (!userChoice.equals("3"));
		
		
		
		
		
		
		
		
		
		
	}

}
