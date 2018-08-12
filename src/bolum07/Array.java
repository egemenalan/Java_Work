package bolum07;

public class Array {

	public static void main(String[] args) {
		int sayi1;
		int sayi2;
		int sayi3;
		int sayi4;

		double[] myList = new double[10];
		myList[0] = 5.6;
		myList[1] = 4.5;
		myList[2] = 3.3;
		myList[3] = 13.2;
		myList[4] = 4.0;
		myList[5] = 34.33;
		myList[6] = 34.0;
		myList[7] = 45.45;
		myList[8] = 99.993;
		myList[9] = 11123;
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		System.out.println(myList.length);
		System.out.println(myList[9]);

	}

}
