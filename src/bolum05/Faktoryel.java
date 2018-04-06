package bolum05;

import java.util.Scanner;

public class Faktoryel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int number = input.nextInt();
		
		int factor = 2;
		while (factor <= number) {
			if(number % factor == 0) {
			break;
			}
			factor++;
		}
		System.out.println("The Smallest factor other than 1 for " + number + " is " + factor );
	}

}
