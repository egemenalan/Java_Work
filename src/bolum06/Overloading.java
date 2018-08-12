package bolum06;

public class Overloading {

	
	public static void main(String[] args) {
		double s1 = 8;
		double s2 = 7;
		
		double max = max(s1,s2);
		System.out.println(max);
		
		int m = max(5,8);
		System.out.println(m);
		
		{
			{
				int i = 5;
				i = 7;
			}
		}
		
	}
	
	public static int max(int num1,int num2, int  num3) {
		return max(max(num1, num2), num3);
	}

	public static int max(int num1,int num2) {
		int max;
		if(num1 > num2)
			max = num1;
		else
			max = num2;
		return max;
	}

	public static double max(double num1 , double num2) {
		double max;
		if(num1 > num2)
		max = num1;
		else
			max = num2;
		return max;
	}
}
