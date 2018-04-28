package bolum06;

public class StackOwerFlowExample {

	public static void main(String[] args) {
		method(0);
	}

	private static void method(int i) {
		i++;
		System.out.println(i);
		method(i);
	}

}
