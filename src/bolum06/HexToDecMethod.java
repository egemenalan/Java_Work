package bolum06;

import java.util.Scanner;

public class HexToDecMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("bir karakter giriniz");
		String girdi = input.nextLine();

		System.out.println("The decimal value for hex number " + girdi.toUpperCase() + " is " + hextodec(girdi.toUpperCase()) );
		;
	}

	private static int hextodec(String girdi) {

		int sayi = 0;
		for (int i = 0; i < girdi.length(); i++) {
			char ch = girdi.charAt(i);
			sayi = sayi * 16 + hexCharToDecimal(ch);
		}
		return sayi;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else // ch is '0', '1', ..., or '9'
			return ch - 'O';

	}

}
