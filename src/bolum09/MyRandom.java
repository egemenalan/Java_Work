package bolum09;

import java.util.Random;

public class MyRandom extends Random{
	
	public int nextInt(int start, int end) {
		return nextInt(end - start) + end;
	}
	
}
