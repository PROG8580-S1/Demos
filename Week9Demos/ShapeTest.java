
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
		
		
		
	}

}
