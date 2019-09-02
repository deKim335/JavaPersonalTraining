package demo;
import java.util.Scanner;

public class PrintCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		System.out.println("Please input full year ex) 2019 : ");
		int year = input.nextInt();
		System.out.println("Please input month ex) (1-12) : ");
		int month = input.nextInt();

		//print a whole year
		printCalendar(year);
		//print a month
		printCalendar(year, month);
		
		input.close();
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);	
	}
	
	public static int howManyDaysInTheMonth(int year, int month) {
		if(isLeapYear(year) && (month==2))
			return 29;
		else if((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 10)||(month == 12))
			return 31;
		else if(month ==2)
			return 28;
		else
			return 30;
	}
	
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;		
	}
	
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0 ;
		for(int i = 1800; i < year; i++) {
			if(isLeapYear(i)) 
				total += 366;
			else 
				total += 365;
		}
		for(int i = 1 ; i < month ; i++ ) {
			total += howManyDaysInTheMonth(year, i);
		}
		return total;
	}
	
	public static String getMonthName(int month) {
		String[] monthName= {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JLY", "AUG", "SEP", "OCT", "NOV", "DEC"};
		
		return monthName[month-1];
	}
	
	public static void printCalendar(int year) {
		for(int month = 1 ; month <= 12 ; month ++) {
			printTitle(year, month);
			printBody(year, month);
		}
	}
	
	public static void printCalendar(int year, int month) {
		printTitle(year, month);
		printBody(year, month);
	}
	
	public static void printTitle(int year, int month) {
		System.out.println("\n\n");
		System.out.println("         "+ year + "  " + getMonthName(month));
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static void printBody(int year, int month) {
		int i = 1;
		int day = 1;
		while( i <= getStartDay(year, month)) {
			System.out.printf("%4s", "");
			i++;
		}
		while (day <= howManyDaysInTheMonth(year, month)) {
			if( i % 7 ==0 ) {
				System.out.printf("%4d\n", day++);
				i++;
			}
			else {
				System.out.printf("%4d", day++);
				i++;
			}
		}
		
	}
	
}
