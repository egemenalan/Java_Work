package bolum07;

public class CopyingArrays {

	public static void main(String[] args) {

		copyArrayReferance();
		copyArrayIndex();
	}

	public static void copyArrayReferance() {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		System.out.println("Before the copy referance : " + array1[0] + " " + array2[0]);

		array2 = array1;

		System.out.println("After the copy referance : " + array1[0] + " " + array2[0]);

	}

	public static void copyArrayIndex() {
		int[] array1 = { 9, 8 ,7 };
		int[] array2 = { 10, 11, 12 };

		System.out.println("Before the copy referance : " + array1[0] + " " + array2[0]);
		for (int i = 0; i < 3; i++) {
			array1[i] = array2[i];
			
		}
		System.out.println("After the copy referance : " + array1[0] + " " + array2[0]);

	}

}
