package bolum07;

import java.util.Scanner;

public class ReturningArrayFromMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Array");
		String str = input.nextLine();
		
		char[] inputArray = str.toCharArray();
		char[] reverseArray = reverse(inputArray);
		
		System.out.print("Reverse Input = ");
		System.out.println(reverseArray);

	}

	public static char[] reverse(char[] list) {
		char[] result = new char[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];

		}
		return result;
	}
}
