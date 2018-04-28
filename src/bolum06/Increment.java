package bolum06;

public class Increment {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Before the call, x is " + x);
		
		increment(x);
		System.out.println("After the call, x is " + x);

	}

	private static void increment(int n) {
		n++;
		System.out.println("After the Increment, x is " + n);

	}

}
