package bolum09;


public class Circle {
	static double radius;

	 public Circle(int i) {
		 radius = i;
	}

	public Circle() {
		radius = 1;
	}

	double getArea() {
		return (Math.pow(radius, 2)) * Math.PI;
		
	}
	
	void setRadius(double newRadius) {
		
		radius = newRadius;
		
	}
	
	double getParameter() {
		
		return 2 * Math.PI * radius;
	}

}
