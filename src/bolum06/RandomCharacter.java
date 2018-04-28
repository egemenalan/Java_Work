package bolum06;

public class RandomCharacter {
	
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) ((Math.random() * (ch1 - ch2 + 1)) - ch1);
	}
	
	public static char getLowerCaseCharacter() {
		return getRandomCharacter('a', 'z');
	}
	public static char getUpperCaseCharacter() {
		return getRandomCharacter('A', 'Z');
	}
	public static char getNumber() {
		return getRandomCharacter('0', '9');
	}
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

}
