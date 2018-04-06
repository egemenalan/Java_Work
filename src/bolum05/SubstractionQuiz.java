package bolum05;

import java.util.Scanner;

public class SubstractionQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int counter = 0;
		int correctCounter = 0;
		while (counter < 2) {

			// 1. Generate two random single-digit integers
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();

			// 3. Grade the answer and display the result
			if (number1 - number2 == answer) {
				correctCounter++;
				System.out.println("You are correct!");
				
			} else {
				System.out.println("Your answer is wrong.");
				
			}
			counter++;
		}
		System.out.println(correctCounter + " correct answer");

	}

}
