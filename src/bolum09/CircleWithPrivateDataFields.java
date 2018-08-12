package bolum09;

public class CircleWithPrivateDataFields {

	private double radius;

	private static int numberOfObjects;

	public CircleWithPrivateDataFields() {
		numberOfObjects++;

	}

	public CircleWithPrivateDataFields(double newRadius) {
		radius = newRadius;
		numberOfObjects++;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	public static int getNumberOfObjects() {		
		return numberOfObjects;
	}

	public double getArea() {
		return radius * radius * Math.PI;

	}

	public void printArea() {
		// TODO Auto-generated method stub
		
	}

}