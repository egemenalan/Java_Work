package bolum07;

import java.util.Scanner;

public class ProcessingArrays {

	public static void main(String[] args) {
		
		 final  int LIST_SIZE = 10;

		int[] myList = new int[LIST_SIZE];
		System.out.println("Get Random Number");
		getRandom(myList);
		

		printArray(myList);
		getSum(myList);

		getGreatesAndIndex(myList);

		getSwap(myList);

		printArray(myList);
		
		getShiftToLeft(myList);
		printArray(myList);
	}

	private static void getRandom(int[] myList) {
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int) (Math.random() * 100);

		}
	}

	private static void getShiftToLeft(int[] myList) {
		int firstElemanOfIndex = myList[0];
		for (int i = 0; i < myList.length -1; i++) {
			myList[i] = myList[i + 1];
		}
		myList[myList.length - 1] = firstElemanOfIndex ;

		System.out.println("Shift to Left"  );
	}

	private static void getSwap(int[] myList) {
		for (int i = 0; i < myList.length; i++) {
			int randomIndex = (int) (Math.random() * myList.length);
			int temp = myList[i];
			myList[i] = myList[randomIndex];
			myList[randomIndex] = temp;
		}
	}

	private static void getGreatesAndIndex(int[] myList) {
		int greater = 0;
		int indexOfMax = -1;
		for (int i = 0; i < myList.length; i++) {
			if (greater < myList[i]) {
				greater = myList[i];
				indexOfMax = i;
			}
		}
		System.out.println("Greates Number: " + greater + " " + indexOfMax);
	}

	private static void getSum(int[] myList) {
		int sum = 0;
		/*
		for (int i = 0; i < myList.length; i++) {
			sum += myList[i];
		}
		*/
		
		for (int e : myList) {
			sum += e;
		}
		System.out.println("Sum :" + sum);
	}

	private static void printArray(int[] myList) {
		// -->for-each loops style   for(int number : myList) ,,,,,, just for using reading methods
		for (int i = 0; i < myList.length; i++) {
			// -->for-each loops style System.out.printf("%3d", number);
			System.out.printf("%3d", myList[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}

		}
	}
}
