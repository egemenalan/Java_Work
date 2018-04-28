package bolum06;

public class TestReturnGradeMethod {

	public static void main(String[] args) {
		
		System.out.print("The Grade is "+ getGrade(78.5));
		System.out.print("\nThe Grade is "+ getGrade(57.5));

	}

	private static char getGrade(double score) {
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
