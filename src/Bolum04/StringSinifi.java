package Bolum04;

public class StringSinifi {

	public static void main(String[] args) {
		
		String str = "Merhaba Dunya i";
		
		// .lenght methodu
		System.out.println(str.length());
		
		// .charAt methodu
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(12));
		//System.out.println(str.charAt(13)); // dizi araligi disinda oldugu icin outofbound hatasi verir
		
		// .concat methodu
		String str2 = "DUNYA SOGUK BUGUN";
		String str3 = str.concat(str2);
		System.out.println(str3);
		// boyle uzun uzun yapacagima asagidaki gibi yaparim
		System.out.println(str + str2);
		
		// 	.toUpperCase methodu
		System.out.println(str.toUpperCase());
		
		// .toLowerCase methodu
		System.out.println(str2.toLowerCase());
		
		// .trim methodu
		str = "      adadad     ";
		System.out.println(str.trim());
	}

}
