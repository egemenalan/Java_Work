package bolum05;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int number1 = input.nextInt();
		
		System.out.println("Enter the Second Number");
		int number2 = input.nextInt();
		
		int obeb = 1;
		int division = 2;
		
		while (division <= number1 && division <= number2) {
			if(number1 % division == 0 &&  number2 % division == 0) {
				obeb = division;
			}
			division++;
		}
		System.out.println(number1 + " and " + number2 + " greatest Common Divisior is " + obeb);

	}

}
