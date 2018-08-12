package bolum09;

public class StatikDegisken {

	public static void main(String[] args) {
		System.out.println("Basladi....");
		
		Data d0 = new Data();
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		Data d4 = new Data();
		Data d5 = new Data();
		Data d6 = new Data();
		Data d7 = new Data();
		Data d8 = new Data();
		Data d9 = new Data();
		
		System.out.println("Bitti...");

	}

}

class Data {
	 static long[] l = new long[Integer.MAX_VALUE / 16];
}