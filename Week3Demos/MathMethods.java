
public class MathMethods {

	public static void main(String[] args) {
		double randDouble, total, tipRate, tipAmount;
		int randInteger, min, max;
		
		//1. Get a random values in a range
		randDouble = Math.random() * 10;
		System.out.println(randDouble);
		
		randInteger = (int)(Math.random() * 10);
		System.out.println(randInteger);

		min = 10;
		max = 13;
		
		randInteger = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(randInteger);

		//2. round a decimal value
		randDouble = 2.5;
		
		System.out.println(Math.ceil(randDouble));
		System.out.println(Math.floor(randDouble));
		System.out.println(Math.round(randDouble));
		System.out.println(Math.rint(randDouble));
		System.out.println(randDouble);

		randDouble = Math.ceil(randDouble);
		System.out.println(randDouble);
		
		//3. get the max and min values
		System.out.println(Math.min(min, max));
		System.out.println(Math.max(4, 3));
		
	    //4. get the absolute value 
		System.out.println(Math.abs(-4.3));
		
		//5. use power and square root
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(16));
		
	    //6. calculate the tip on a bill and 
		//   format output with specifier

		total = 67.45;
		tipRate = 0.15;
		tipAmount = total * tipRate;
		
		System.out.println("tip amount: $" + tipAmount);
		System.out.printf("tip amount: $%.2f\n", tipAmount);
		System.out.printf("total: $%.2f    tip: $%.2f", total, tipAmount);

		//7. create a table of values
		System.out.println("\n");
	    System.out.printf("%-10s%-10s%-10s", "x", "x^2", "x^3");
	    System.out.printf("\n%-10.0f%-10.2f%-10.0f", 1.0, Math.pow(1, 2), Math.pow(1, 3));
	    System.out.printf("\n%-10.3f%-10.0f%-10.0f", 2.0, Math.pow(2, 2), Math.pow(2, 3));
	    System.out.printf("\n%-10.0f%-10.4f%-10.0f", 3.0, Math.pow(3, 2), Math.pow(3, 3));
		
	}

}
