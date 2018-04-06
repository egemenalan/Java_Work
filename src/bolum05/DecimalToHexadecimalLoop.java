package bolum05;

import java.util.Scanner;

public class DecimalToHexadecimalLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a decimal integer
		System.out.println("Enter a Number");
		int decimalNumber = input.nextInt();
		
		// Convert decimal to hex
		String hex = "";
		
		while (decimalNumber != 0) {
			int hexValue = decimalNumber % 16;
			char hexDigit = (hexValue <= 9 && hexValue >=0) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			hex = hexDigit + hex;
			decimalNumber = decimalNumber / 16;
		}
		System.out.println("The hex number is " + hex);
	}

}
