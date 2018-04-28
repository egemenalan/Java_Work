package bolum06;

public class PassingArgumentsByValues {

	public static void main(String[] args) {
		nprintln("Hello Java " , 33);
		
	}

	private static void nprintln(String string, int i) {
		for (int j = 0; j < i; j++) {
			System.out.println(string);
		}
		
	}

}
