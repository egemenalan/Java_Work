package bolum06;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		primeNumberCount(100);
	}

	private static void primeNumberCount(int numberOfPrimes) {
		int primeNumberCount = 0;
		int number = 2;

		while (primeNumberCount < numberOfPrimes) {
			boolean isPrimeNumber = true;
			
			if (isPrime(number)) {
				primeNumberCount++;
				System.out.printf("%8d" , number);
				if(primeNumberCount % 10 == 0)
					System.out.println();
			}
			number++;
		}
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
