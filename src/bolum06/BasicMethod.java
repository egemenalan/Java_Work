package bolum06;

public class BasicMethod {

	public static void main(String[] args) {
		System.out.println("From 1 to 10 Mult= " + i(1,10));
		System.out.println("From 2 to XXX Mult= " + i(2,1092736393));
		System.out.println("From 56 to 100 Mult= " + i(56,100));

	}

	private static int i(int i, int j) {
		int sum = 0;
		for (int j2 = i; j2 <= j; j2++) {
			sum += j2;
			
		}
		return sum;
	}

}
