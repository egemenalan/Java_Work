package bolum09;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random randomNumber1 = new Random(12);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(randomNumber1.nextInt(100) + " ");
			
		}
		System.out.println();
		
		Random randomNumber2 = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(randomNumber2.nextInt(100) + " ");

			
		}
	}

}
