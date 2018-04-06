package bolum05;

public class NestedLoops {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 5; k++) {
					count++;
					System.out.println("Count: " + count + " -i : " + i + " j : " + j + " k : " + k);
				}
				
			}
			
		}
	}

}
