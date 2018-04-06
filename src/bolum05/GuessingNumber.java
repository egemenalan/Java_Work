package bolum05;

import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 100);
		System.out.println(randomNumber);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Guess");
		int guessNumber = input.nextInt();
		
		while (guessNumber != randomNumber) {
			if(guessNumber > randomNumber) {
				System.out.println("Your Guess is too High");
			}else {
				System.out.println("Your Guess is too Low");
			}
			guessNumber = input.nextInt();
		}
		System.out.println("Yes the Number is " + randomNumber);
	}

}
