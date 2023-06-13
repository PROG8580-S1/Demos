
public class TwoDimArrays {

	public static void main(String[] args) {
		example1();

	}

	public static void example1() {
		int[][] numbers = new int[2][3];

		System.out.println("number of rows: " + numbers.length);
		
		for(int row = 0; row <numbers.length; row++)
		{
			System.out.println("row: " + row + " length "+ numbers[row].length);
		}
	}
}
