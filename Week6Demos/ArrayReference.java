
public class ArrayReference {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = array1;
		int[] array3 = new int[array1.length];

		array1[0] = -1;
		array2[0] = -2;

		System.out.println(array1[0]);
		System.out.println(array2[0]);

		modifyArray(array1);
		System.out.println(array1[0]);
		System.out.println(array2[0]);

		// make a copy of an array
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}

		displayArray(array1);
		displayArray(array3);
		
		array1[0] = 1;
		
		displayArray(array1);
		displayArray(array2);
		displayArray(array3);
	}

	public static void modifyArray(int[] methodArray) {
		methodArray[0] = 9;
	}

	public static void displayArray(int[] numbers) {
		System.out.println();
		
		for(int num : numbers) {
			System.out.print(num + " ");
		}
	}

	
	
	
	
	
	
	
}
