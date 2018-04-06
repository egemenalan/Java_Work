package bolum05;

import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = input.nextInt();
		System.out.println(number);
		int sum = 0;
		while (number != 0) {
			sum += number;
			System.out.println("Enter the Number");
			number = input.nextInt();
		}
		System.out.println("Sum " + "=" + sum);
	}

}
