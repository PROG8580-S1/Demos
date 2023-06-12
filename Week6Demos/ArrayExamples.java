
public class ArrayExamples {

	public static void main(String[] args) {
		int number;

		int[] numbers = new int[5];
		double[] doubleArray = new double[5];
		String[] stringArray = new String[5];
		boolean[] boolArray = new boolean[5];

		// 1. Display default values in empty arrays
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + " ");
		}
		
		System.out.println();

		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + " ");
		}
		
		System.out.println();

		for (int i = 0; i < boolArray.length; i++) {
			System.out.print(boolArray[i] + " ");
		}
		
		//2. Add values 1-5 to array and display
		number = 99;
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		// Add 1 to each value in array and display
		//
		// Sample Output:
		// 2 3 4 5 6
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]++;
			System.out.print(numbers[i] + " ");
		}
		
		// Sum all the values in the given array
		//
		// Sample Output:
		// The sum is 20
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = numbers[i] + sum;
		}
		
		System.out.println("\nThe sum is: " + sum );
		
		// Perform the following on the given array, then display
		// the updated array values.
		//
		// - add 5 to the element at index 1
		// - multiply the element at index 2 by element
		// at index 4, and place result back at index 2
		// - subtract the element at index 1 from element
		// at index 0 and place result in at index 0
		// - swap the elements at index 3 and index 4
		// - output with a foreach loop
		//
		// Sample Output
		// -6 8 24 6 5
		
		numbers[1] = numbers[1] + 5; // numbers[1] += 5;
		numbers[2] = numbers[2] * numbers[4];
		numbers[0] = numbers[0] - numbers[1];
		
		int temp = numbers[3];
		numbers[3] = numbers[4];
		numbers[4] = temp;
		
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		for(int num : numbers) {
			System.out.print(num + " ");
		}

	}

	
	
	
	
	
	
	
	
	
}
