/* PayCalculator.java
 * Calculate your wages based on hours worked
 * 
 * Revision History:
 *     Tony Theo...  2023.15.05: Created
 */

import java.util.Scanner;

public class PayCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declare variables
		String firstName;
		double hours;
		double payRate;
		double preTax;
		double taxRate = 0.25;
		double tax;
		double earned;
		
		//get inputs
		System.out.println("Enter your name: ");
		firstName = input.nextLine();
		
		System.out.println("Enter your hours worked: ");
		hours = input.nextDouble();
		
		System.out.println("Enter your pay rate: ");
		payRate = input.nextDouble();
		
		//processing - doing calcuations
		preTax = hours * payRate;
		tax = preTax * taxRate;
		earned = preTax - tax;
		
		//show outputs
		System.out.println();
		System.out.println("Pay Calcuation for: " + firstName);
		System.out.printf("Pre tax           : $%.2f\n", preTax);
		System.out.println("Tax Amount        : " + tax);
		System.out.println("Earned            : " + earned);
		
		
		
		
		
		

	}

}
