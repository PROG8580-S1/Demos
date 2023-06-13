import java.util.Scanner;

public class TwoDimArrays {

	public static void main(String[] args) {
		//example1();
		example3();

	}

	public static void example1() {
		Scanner input = new Scanner(System.in);

		int[][] numbers = new int[2][6];

		System.out.println("number of rows: " + numbers.length);

		for (int row = 0; row < numbers.length; row++) {
			System.out.println("row: " + row + " length " + numbers[row].length);
		}

		// add input from the user
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print("Enter value for row " + row + " col " + col + ":");
				numbers[row][col] = input.nextInt();
			}

			System.out.println();
		}

		// displays values in a a 2d array
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}

			System.out.println();

		}

		// display the information in column 2
		System.out.println("\nColumn 2 (index = 1):");

		for (int row = 0; row < numbers.length; row++) {
			System.out.println(numbers[row][1]);
		}

		// display the information in row index 1
		System.out.println("\nRow 2 (index = 1):");

		for (int col = 0; col < numbers[1].length; col++) {
			System.out.print(numbers[1][col] + " ");
		}

	}

	public static void example2() {
		int totalSales;

		int[][] sales = { { 1000, 1500, 1200, 2100 }, 
				{ 800, 2200, 2500, 500 }, 
				{ 1200, 1000, 700, 700 } };
		
		for (int row = 0; row < sales.length; row++) {
			totalSales = 0;
			
			for (int col = 0; col < sales[row].length; col++) {
				System.out.print(sales[row][col] + " ");
				totalSales = totalSales + sales[row][col];
			}

			System.out.println(" Total: " + totalSales);

		}
	}
	
	public static void example3() {
		int totalSales;

		int[][] sales = { { 1000, 1500, 1200, 2100 }, 
				{ 800, 2200 }, 
				{ 1200, 1000, 700 } };

		System.out.println("number of rows: " + sales.length);

		for (int row = 0; row < sales.length; row++) {
			System.out.println("row: " + row + " length " + sales[row].length);
		}
		
		for (int row = 0; row < sales.length; row++) {
			totalSales = 0;
			
			for (int col = 0; col < sales[row].length; col++) {
				System.out.print(sales[row][col] + " ");
				totalSales = totalSales + sales[row][col];
			}

			System.out.println(" Total: " + totalSales);

		}
	}
}
