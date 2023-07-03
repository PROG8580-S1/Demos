import java.util.Date;

public class Car {
	private int year;
	private String make;
	private int mileage;
	private double price;
	private double delivery;
	private double total;
	private Date dateCreated;
	
	public static int numberOfCars = 0;

	public Car() {
		delivery = 500;
		dateCreated = new Date();
		
		numberOfCars++;
	}

	public Car(int year, String make, int mileage, double price) {
		this.year = year;
		this.make = make;
		this.mileage = mileage;
		this.price = price;
		
		delivery = 500;
		total = delivery + price;
		
		numberOfCars++;
	}

	public int getYear() {
		return year;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;		
		total = delivery + price;
	}
	
	public double getTotal() {
		return total;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
}
