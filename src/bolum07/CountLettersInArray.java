package bolum07;

public class CountLettersInArray {

	public static void main(String[] args) {

		char[] characters = createArray();

		printCharacterArray(characters);

		int[] count = countArrayElemant(characters);
		
		printCount(count);
		
	}

	

	private static void printCharacterArray(char[] characters) {
		for (int i = 0; i < characters.length; i++) {
			System.out.print(characters[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}

	private static char[] createArray() {
		char[] array = new char[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = findRandomCharacter();

		}
		return array;
	}

	private static char findRandomCharacter() {

		return (char) ((Math.random() * 26) + 'a');
	}

	private static int[] countArrayElemant(char[] characters) {
		int[] count = new int[26];
		for (int i = 0; i < characters.length; i++) {

			count[characters[i] - 'a']++;

		}
		return count;
	}
	
	private static void printCount(int[] count) {
		for (int i = 0; i < count.length; i++) {
			System.out.println((char)('a' + i) + " " + count[i]);
			
		}
	}

}
