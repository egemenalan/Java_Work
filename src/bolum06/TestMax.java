package bolum06;

public class TestMax {

	public static void main(String[] args) {
		int i = 5;
		int j = 21;
		int k = max(i,j);
		System.out.println("The Maximum of " + i + " and " + j + " is " + k);
	}

	private static int max(int num1, int num2) {
		int result;
		if(num1 > num2) {
			result = num1;
			
		}else {
			result = num2;
		}
		return result;
	}

}
