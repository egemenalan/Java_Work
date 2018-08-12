package bolum10;

import java.util.Scanner;

public class TestLoan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter annual Interest Rate");
		double annualInterestRate = scanner.nextDouble();
		
		System.out.println("Enter number of Years");
		int numberOfYears = scanner.nextInt();
		
		System.out.println("Enter Loan Amount");
		double loanAmount = scanner.nextDouble();
		
		Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
		
		System.out.println("Loan Date = " + loan.getLoanDate() + " Monthly Payment = " + loan.getMonthlyPayment() + " Total Payment= " + loan.getTotalPayment());
		
		
	}

}
