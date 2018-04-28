package bolum06;

public class TestRandomCharacter {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomCharacter.getLowerCaseCharacter());

		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomCharacter.getUpperCaseCharacter());

		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomCharacter.getNumber());

		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomCharacter.getRandomCharacter());

		}
	}

}
