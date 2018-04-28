package bolum06;

import java.util.Scanner;

public class PrintCalendar {

	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter full year (e.g., 2012): ");
		int year = input.nextInt();

		System.out.println("Enter month as number between 1 and 12: ");
		int month = input.nextInt();

		printhMonth(year, month);

	}

	/** Print the calendar for a month in a year */
	private static void printhMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);

	}
	/** Print the month title, e.g., March 2012 */
	private static void printMonthTitle(int year, int month) {
		String monthName = findMonthName(month);
		System.out.println("          " + monthName + " " + year);
		System.out.println(" -----------------------------");
		System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

	}
	/** Get the English name for the month */
	private static String findMonthName(int month) {
		
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "Februay";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";

		default:
			break;
		}
		return null;
	}
	/** Print month body */
	private static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
			
		}
		System.out.println();
	}
	/** Get the start day of month/1/year */
	private static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	/** Get the total number of days since January 1, 1800 */
	private static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;
		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);
		return total;
	}
	/** Get the number of days in a month */
	private static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2) return isLeapYear(year) ? 29 : 28;
		return 0;

	}
	/** Determine if it is a leap year */
	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
