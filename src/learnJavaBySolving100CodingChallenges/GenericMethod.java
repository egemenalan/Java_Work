package learnJavaBySolving100CodingChallenges;

public class GenericMethod {
	
	public static < E > void printArray( E[] inputArray) {
		// display input array
		for (E element : inputArray) {
			System.out.printf("%s" , element);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		//Create array of Integer, Double and Characker
		Integer[] intArray = {1,2,3,4};
		Double[] doubleArray = {1.0, 2.0, 3.0, 4.0 };
		Character[] charArray = {'A', 'B', 'C', 'D' };
		
		System.out.println("Array integerArray Contains: ");
		printArray(intArray);
		
		System.out.println("Array doubleArray Contains: ");
		printArray(doubleArray);
		
		System.out.println("Array charArray Contains: ");
		printArray(charArray);
		
	}

}
