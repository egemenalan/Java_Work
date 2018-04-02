package Bolum04;

import java.util.Scanner;

public class OrderTwoCitiys {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ilk sehri giriniz");
		String sehir1 = input.nextLine();
		
		System.out.println("ikinci sehri giriniz");
		String sehir2 = input.nextLine();
		
		if(sehir1.compareTo(sehir2) < 0) {
			System.out.println("sehirlerin liste siralamasi " + sehir1 + " " + sehir2);
		}else {
			System.out.println("sehirlerin liste siralamasi " + sehir2 + " " + sehir1);
		}
	}

}
