
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		displayCar(c1);
		System.out.println(Car.numberOfCars);
		
		//Create 2 cars with pre-defined values, then display them
		Car c2 = new Car(2010, "Honda", 25000, 5500);
		Car c3 = new Car(2020, "Toyota", 3000, 32000);
		
		displayCar(c2);
		displayCar(c3);
		System.out.println(Car.numberOfCars);

		//change the mileage on c2 and display again.
		c2.setMileage(26000);
		displayCar(c2);
		
		//change the price on c3 and display again
		c3.setPrice(30000);
		displayCar(c3);

	}
	
	public static void displayCar(Car car)
	{
		System.out.println(car.getYear() 
				+ " " + car.getMake() 
				+ " - " + car.getMileage()
				+ " - $" + car.getTotal());
	}

}
