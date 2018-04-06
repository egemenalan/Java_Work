package bolum05;

public class PrimeNumber {

	public static void main(String[] args) {
		int primeNumberCount = 0;
		int number = 2;

		while (primeNumberCount < 50) {
			boolean isPrimeNumber = true;

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrimeNumber = false;
				}

			}
			if (isPrimeNumber == true) {
				primeNumberCount++;
				System.out.println("Number " + number + " is a Prime Number");
			}
			number++;
		}
	}

}
