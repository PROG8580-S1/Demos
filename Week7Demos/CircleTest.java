
public class CircleTest {

	public static void main(String[] args) {
		//create circle with default constructor
		Circle circle1 = new Circle();
		
		System.out.println("\nCircle 1");
		System.out.println("radius: " + circle1.radius);
		System.out.println("area  : " + circle1.getArea());
		
		//create new circle with non-default constructor
		Circle circle2 = new Circle(7);
		
		System.out.println("\nCircle 2");
		System.out.println("radius: " + circle2.radius);
		System.out.println("area  : " + circle2.getArea());
		
		
		//modify existing circle
		circle1.radius = 100;
		
		System.out.println("\nCircle 1");
		System.out.println("radius: " + circle1.radius);
		System.out.println("area  : " + circle1.getArea());
		
		//create circle3 equal to circle1
		//modify circle3 and show effect to circle1
		Circle circle3 = circle1;
		System.out.println("\nCircle 3");
		System.out.println("radius: " + circle3.radius);
		System.out.println("area  : " + circle3.getArea());
		
		circle3.radius = 150;
		
		System.out.println("\nCircle 1");
		System.out.println("radius: " + circle1.radius);
		System.out.println("area  : " + circle1.getArea());
		System.out.println("\nCircle 3");
		System.out.println("radius: " + circle3.radius);
		System.out.println("area  : " + circle3.getArea());
		
		
		
		
		
		
		
		
		
		
	}

}
