package bolum05;

public class TestContinue {

	public static void main(String[] args) {
		int number = 0;
		int sum = 0;

		while (number < 20) {
			number++;
			if (number == 10 || number == 11) {
				continue;
			}
			sum += number;

		}
		System.out.println(number);
		System.out.println(sum);
	}

}
