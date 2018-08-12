package bolum09;

public class StaticVsInstance {
	int i = 5;
	static int k = 2;

	public static void main(String[] args) {
		int j = i; // Wrong because i is an instance variable
		m1(); // Wrong because m1() is an instance method

	}

	private void m1() {
		// Correct since instance and static variables and methods
		// can be used in an instance method
		i = i + k + m2(i, k);
	}

	private int m2(int i, int j) {
		return (int) (Math.pow(i, j));
	}
}

class V2 {
	int i = 5;
	static int k = 2;

	public static void main(String[] args) {
		V2 a = new V2();
		int j = a.i; // OK, a.i accesses the object's instance variable 
		a.m1(); // OK. a.m1() invokes the object's instance method

	}

	public void m1() {
		i = i + k + m2(i, k);
	}

	private int m2(int i, int j) {
		return (int) (Math.pow(i, j));
	}

}
