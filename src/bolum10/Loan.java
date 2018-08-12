package bolum10;

import java.sql.Date;

public class Loan {

	private double annualInterstRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	public Loan() {
		this(2.5, 1, 1000);

	}

	public Loan(double annualInterstRate, int numberOfYears, double loanAmount) {
		this.annualInterstRate = annualInterstRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();

	}

	public double getAnnualInterstRate() {
		return annualInterstRate;
	}

	public void setAnnualInterstRate(double annualInterstRate) {
		this.annualInterstRate = annualInterstRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}
	
	public double getMonthlyPayment() {
		double monthlyInterstRate = annualInterstRate / 1200;
		double  monthlyPayment = loanAmount * monthlyInterstRate / (1-(1 / Math.pow(1 + monthlyInterstRate,numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
}
