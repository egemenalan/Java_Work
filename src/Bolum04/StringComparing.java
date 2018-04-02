package Bolum04;

public class StringComparing {

	public static void main(String[] args) {
		
		String str1 = "jave";
		String str2 = "ege";
		
		// .equal methodu
		boolean b = str1.equals(str2);
		if(b) {
			System.out.println("iki string birbirine esit");
		}else {
			System.out.println("iki string birbirine esit degil");
		}
		// .equalIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// .compareTo methodu
		System.out.println(str1.compareTo(str2));
		
		// .compareToIgnoreCase
		System.out.println(str1.compareToIgnoreCase(str2));
		
		int kiyaslamaDegeri = compareTo(str1,str2);
		if(kiyaslamaDegeri == 0) {
			System.out.println(str1 + " esittir " + str2);
		}else if(kiyaslamaDegeri > 0) {
			System.out.println(str1 + " buyuktur " + str2);
		}else {
			System.out.println(str1 + " kucuktur " + str2);
		}
	}

	private static int compareTo(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str1.charAt(i);
			if(ch1 != ch2) {
				return ch1 - ch2;
			}
			
		}
		return 0;
	}

}
