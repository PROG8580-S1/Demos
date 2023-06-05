import java.util.Scanner;
public class MethodReturns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, answer;
		double side1, side2, area;
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
	}

	public static int add(int x, int y) {
		int sum;
		sum = x + y;

		return sum;
	}
	
	public static double areaRectangle(double length, double width) {
		return length * width;
	}
	
	
	
	
	
	
	
	
}
