package bolum09;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		
		circle1.setRadius(35.34);
		
		System.out.println("Parameter is " + circle1.getArea());
		
		Circle circle2 = new Circle();
		circle2.setRadius(2);
		
		circle2 = new Circle(2);
		
		System.out.println("Parameter is " + circle2.getArea());

		
	}

}
