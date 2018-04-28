package bolum06;

public class ReturnVoidMethod {

	public static void main(String[] args) {

		System.out.print("The Grade is "+ getGrade(78.5));
		System.out.print("\nThe Grade is "+ getGrade(157.5));

	}

	private static char getGrade(double score) {
		if(score > 100) {
			return 0;
		}
		if(score >=90)
			return 'A';
		else if(score >= 80)
			return 'B';
		else if(score>=70)
			return 'C';
		else if(score>=60)
			return 'D';
		else
			return 'F';
	}



}
