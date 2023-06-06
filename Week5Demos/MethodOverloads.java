import java.util.Scanner;

public class MethodOverloads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1, side2, answer;
		int intSide1, intSide2, intAnswer;

		System.out.print("Enter side 1: ");
		side1 = input.nextDouble();

		System.out.print("Enter side 2: ");
		side2 = input.nextDouble();

		answer = area(side1, side2);
		System.out.println("area is " + answer + "u^2");

		answer = area(side1);
		System.out.println("area is " + answer + "u^2");
		
		System.out.print("Enter side 1: ");
		intSide1 = input.nextInt();

		System.out.print("Enter side 2: ");
		intSide2 = input.nextInt();

		intAnswer = area(intSide1, intSide2);
		System.out.println("area is " + intAnswer + "u^2");
	}

	public static double area(double length, double width) {
		return length * width;
	}

	public static double area(double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}

	public static int area(int length, int width) {
		return length * width;
	}

}
