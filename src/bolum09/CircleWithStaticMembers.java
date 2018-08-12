package bolum09;

public class CircleWithStaticMembers {
	
	double radious;
	
	static int numberOfObject;
	
	 CircleWithStaticMembers() {
		 radious = 1;
		  numberOfObject++;
	}
	 
	 CircleWithStaticMembers(double newRadius){
		 radious = 5;
		 numberOfObject++;
	 }
	 
	 static int getNumberOfObject() {
		return numberOfObject;
		 
	 }
	 double getArea() {
		return radious * radious * Math.PI;
		 
	 }
}


