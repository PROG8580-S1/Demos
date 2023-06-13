
public class ArraySearch {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		int index;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}

		displayArray(numbers);

		index = linearSearch(numbers, 5);
		System.out.println("\n" + index);

		selectionSort(numbers);
		displayArray(numbers);
		
		index = binarySearch(numbers, 5);
		System.out.println("\n" + index);

	}

	public static int linearSearch(int[] searchArray, int searchValue) {

		for (int i = 0; i < searchArray.length; i++) {
			if (searchArray[i] == searchValue) {
				return i;
			}
		}

		return -1;
	}

	public static int binarySearch(int[] searchArray, int searchValue) {

		int low = 0;
		int high = searchArray.length - 1;
		
		while(high >= low) {
			int mid = (low + high) / 2;
			
			if(searchArray[mid] > searchValue) {
				high = mid - 1;
			} else if (searchArray[mid] == searchValue) {
				return mid;
			}
			else {
				low = mid + 1;
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
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}

}
