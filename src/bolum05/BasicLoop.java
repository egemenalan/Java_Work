package bolum05;

public class BasicLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Merhaba Java");
			
		}
		long x = 80000000;
		while (x > 0)
			x++;
		System.out.println("x is " + x);

		x--;

		System.out.println("x is " + x);

		while (true) {
			if (x < 10)
				break;
		}

		System.out.println("Calismaz");

		int i = 1;
		int sum = 0;
		while (sum < 10000) {
			sum = sum + i;
			i++;
		}

		for (int j = 1; sum < 10000; j++) {
			sum += j;

		}

		int balance = 10;
		while (true) { // for(;;) {
			if (balance < 9)
				continue;
			balance = balance - 9;
		}

	}

}