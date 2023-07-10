
public class ShapeTest {

	
	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		
		//get values from Circle Class
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Area: " + c1.getArea());
		System.out.println("Diameter: " + c1.getDiameter());
		
		System.out.println();
		c1.printCircle();
		
		// Get values from GeometricObject Class
		System.out.println();
		System.out.println("Color: " + c1.getColor());
		System.out.println("filled: " + c1.isFilled());
		
		// Build a rectangle object
		Rectangle r1 = new Rectangle(2, 4);
		
		//get values from Rectangle Class		
		System.out.println();
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		
		//add an author to the circle and rectangle
		c1.setCreatedBy("Tony");
		r1.setCreatedBy("Ari");
		
		System.out.println("Circle creator: " + c1.getCreatedBy());
		System.out.println("Rect. creator: " + r1.getCreatedBy());
				
		//override the toString method
		System.out.println();
		System.out.println(r1.toString());
		System.out.println(c1.toString());
		
		// Create a circle and rectangle with a size, colour, and fill
		Circle c2 = new Circle(4, "Red", true);
		Rectangle r2 = new Rectangle(3, 5, "Black", false);
		
		// Create displayObject method that accepts a 
		// GeometricObject and then call it on c2 and r2
		displayObject(c2);
		displayObject(r2);

		//Create two generic objects, one of type Circle, 
		//one of type Rectangle
		Object o1 = new Circle(1);
		Object o2 = new Rectangle(2, 3);
		
		// Create another displayObject method, 
		// this time accepting an Object
		displayObject(o1);
		displayObject(o2);
	}

	public static void displayObject(GeometricObject g) {
		System.out.println("\nCreated on: " + g.getDateCreated());
		System.out.println("Colour: " + g.getColor());
		System.out.println("Filled: " + g.isFilled());
	}
	
	public static void displayObject(Object object) {
		if(object instanceof Circle) {
			System.out.println("Area: " + ((Circle)object).getArea());
		} else if (object instanceof Rectangle) {
			System.out.println("Area: " + ((Rectangle)object).getArea());
		}
	}
	
	
	
	
	
}
