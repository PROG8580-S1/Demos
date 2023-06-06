import java.util.Scanner;
public class MethodReturns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, answer, prints;
		double side1, side2, area, price;
		System.out.print("Enter a number: ");
		num1 = input.nextInt();

		System.out.print("Enter a number: ");
		num2 = input.nextInt();
		
		answer = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + answer);
		
		System.out.print("Enter side 1: ");
		side1 = input.nextDouble();

		System.out.print("Enter side 2: ");
		side2 = input.nextDouble();
		
		area = areaRectangle(side1, side2);
		System.out.println(side1 + " x " + side2 + " = " + area + "u^2");
		
		System.out.print("Number of prints: ");
		prints = input.nextInt();
		
		price = printPrice(prints);
		System.out.println("Prints: " + prints);
		System.out.println("Price:  " + price);
	}

	public static int add(int x, int y) {
		int sum;
		sum = x + y;

		return sum;
	}
	
	public static double areaRectangle(double length, double width) {
		return length * width;
	}
	
	// Create a method to determine a printing price based on volume
	//
	// 0 - 10 prints: $1.00/print
	// 11 - 50 prints: $0.75/print
	// 51 - 100 prints: $0.65/print
	// 101 or over: $0.50/print
	
	public static double printPrice(int copies)
	{
		double pricePerCopy, price;
		
		if(copies <=10) {
			pricePerCopy = 1.00;
		} else if (copies <=50) {
			pricePerCopy = .75;
		} else if (copies <= 100) {
			pricePerCopy = .65;
		}
		else
		{
			pricePerCopy = .50;
		}
		
		price = copies * pricePerCopy;
		return price;
	}
	
	
	
	
	
	
}
