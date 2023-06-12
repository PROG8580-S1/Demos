
public class ArraySearch {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int index;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}

		displayArray(numbers);

		index = linearSearch(numbers, 9);
		System.out.println("\n" + index);

		selectionSort(numbers);
		displayArray(numbers);

	}

	public static int linearSearch(int[] searchArray, int searchValue) {

		for (int i = 0; i < searchArray.length; i++) {
			if (searchArray[i] == searchValue) {
				return i;
			}
		}

		return -1;
	}

	public static void displayArray(int[] numbers) {
		System.out.println();

		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++)
		{
			int currentMin = array[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}

}
