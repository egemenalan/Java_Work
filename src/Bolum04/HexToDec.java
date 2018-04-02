package Bolum04;

import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("bir karakter giriniz");
		String girdi = input.next();
		
		if(girdi.length() > 1) {
			System.err.println("tek basamakli karakter giriniz");
			System.exit(0);
		}
		
		char ch = girdi.charAt(0);
		int sayi = 0;
		
		if('a' <= ch && 'f' >= ch) {
			sayi = ch - 'a' + 10;
		}else if('0' <= ch && '9' >= ch) {
			sayi = ch - '0';
		}else {
			System.err.println("hatali giris yaptiniz");
			System.exit(0);
		}
		System.out.println("hex " + ch + " degeri " + sayi);
	}

}
