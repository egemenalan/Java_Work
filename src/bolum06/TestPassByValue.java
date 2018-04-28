package bolum06;

public class TestPassByValue {
	/** Main method */
	public static void main(String[] args) {
		// Declare and initialize variables
		int x = 1;
		int y = 2;

		System.out.println("Before invoking the swap method, x is " + x + " and y is " + y);

		// Invoke the swap method to attempt to swap two variables
		swap(x, y);

		System.out.println("After invoking the swap method, x is " + x + " and y is " + y);
	}

	/** Swap two variables method */
	private static void swap(int n1, int n2) {
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
	}

}
