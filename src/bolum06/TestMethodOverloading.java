package bolum06;

public class TestMethodOverloading {

	public static void main(String[] args) {
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));

		System.out.println("The maximum 3.4 and 4.9 is " + max(3.4, 4.9));
		
		System.out.println("The maximum 3.4 and 4.9 and 7.2 is " + max(3.4, 4.9,7.2));
	}

	private static double max(double d, double e, double f) {
		
		return max(max(d, e), f);
	}

	private static double max(double d, double e) {
		if (d > e)
			return d;
		else
			return e;
	}

	private static int max(int i, int j) {
		if (i > j)
			return i;
		else
			return j;
	}

}
