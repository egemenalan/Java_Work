package bolum05;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
	    int number2 = (int)(Math.random() * 10);

	    // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    System.out.print(
	      "What is " + number1 + " + " + number2 + "? ");

	    int answer = input.nextInt();
	    int count = 0;
	    
	    while (answer != (number1+number2) && count < 3) {
	    	count++;
			System.out.println(number1 + " + " + number2 + " is not " + answer + " try again!");
			answer = input.nextInt();
		}
		if(answer == (number1+number2) ) {
			System.out.println("correct");
		}else {
			System.out.println("You tried 3th times");
		}
	    
	    /*for (int answer = input.nextInt();  answer != (number1 + number2);) {
	    	System.out.println(number1 + " + " + number2 + " is not " + answer + " try again!");
			answer = input.nextInt();
		}
	    System.out.println("correct");
	    }*/
	}
}
