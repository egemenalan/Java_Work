package bolum05;

public class TestBreak {

	public static void main(String[] args) {
		
		int number = 0;
		int sum = 0;
		
		while (number < 20) {
			number++;
			sum += number;
			if(sum >= 100) {
				break;
			}
			
		}
		System.out.println(number);
		System.out.println(sum);
	}

}
