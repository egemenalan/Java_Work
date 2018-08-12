package bolum09;

public class TotalArea {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
		
		createCircleArray(circleArray);
		
		printCircleArray(circleArray);
		
		printArea();
		
	}

	private static void printArea() {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			double radius = Math.random() * 100;
			double area = radius * 2 * Math.PI;
			sum += area;
			System.out.printf("%-30f%-15f\n", radius, area);
		}
		System.out.println("—————————————————————————————————————————-");
		// Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is", sum);
	}

	private static void createCircleArray(CircleWithPrivateDataFields[] circleArray) {
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
		}
	}

	private static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}
		System.out.println("—————————————————————————————————————————-");
		// Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
		
	}

	private static Object sum(CircleWithPrivateDataFields[] circleArray) {
		// Initialize sum
		double sum = 0;
		// Add areas to sum
		for (int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
			circleArray[i].printArea();
		}
		
		foo();
		return sum;
	}
	
	void foo() {}

}
