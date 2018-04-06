package bolum05;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Sentence");
		String sentence = input.nextLine();

		boolean isPalindrom = true;
		for (int i = 0, j = sentence.length() - 1; i < j; i++, j--) {
			char ch1 = sentence.charAt(i);
			char ch2 = sentence.charAt(j);
			if (ch1 != ch2) {
				isPalindrom = false;
				break;
			}

		}
		if (isPalindrom) {
			System.out.println(sentence + " is a Palindrom");
		} else {
			System.out.println(sentence + " is not a Palindrom");
		}
	}

}
