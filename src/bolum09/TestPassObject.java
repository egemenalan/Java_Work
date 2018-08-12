package bolum09;

import java.util.Date;

public class TestPassObject {

	public static void main(String[] args) {
		
		printDate();
		
		// Create a Circle object with radius 1
		CircleWithPrivateDataFields circle = new CircleWithPrivateDataFields(1);

		// Print areas for radius 1, 2, 3, 4, and 5.
		int n = 5;
		printAreas(circle, n);
		System.out.println("Radius is : " + circle.getRadius());
		System.out.println("n is " + n);

	}

	private static void printDate() {
		Date d = new Date();
		System.out.println(d.toString());
		
	}

	private static void printAreas(CircleWithPrivateDataFields circle, int cycle) {
		for (int i = 0; i < cycle; i++) {
			System.out.println(circle.getRadius() + "\t\t" + circle.getArea());
			circle.setRadius(circle.getRadius() + 1);
		}
		cycle = 10;
	}

}
