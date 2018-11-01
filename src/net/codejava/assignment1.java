package net.codejava;

import java.io.IOException;
import java.util.Scanner;

public class assignment1 {
	static int Day = 0; static int Month = 0; static int Year = 0;
	static boolean isLeapYear = false;
	
	static int minYear = 1582;
	static int maxYear = 2099;
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("#####################################");
		System.out.println("### Welcome to RRC DATE FORMATTER ###");
		System.out.println("#####################################");
		System.out.print("Please enter a valid Day (1-31): ");
		Day = scan.nextInt();
		System.out.println("Please enter a valid Month (1-12): ");
		Month = scan.nextInt();
		System.out.printf("Please enter a valid Year (1582-%d): ", maxYear);
		Year = scan.nextInt();
		
		boolean validYear = getYear();
		if (validYear == true ) {
			boolean validMonth = getMonth();
			if (validMonth == true) {
				boolean validDay = getDay();
				if (validDay == true) {
					//System.out.println("WOOT!");
					dateFormatter();
				}
			}
			
		}
		
	}
	public static boolean getDay() {
		
		if ( Month == 4 || Month == 6 || Month == 9 || Month == 11 ) {
			System.out.print("Please enter a valid Day (1-30): ");
		} else if ( Month == 2 && isLeapYear == false ) {
			System.out.print("Please enter a valid Day (1-28): ");
		} else if (Month == 2 && isLeapYear == true) {
			System.out.print("Please enter a valid Day (1-29): ");
		} else {
			
		  System.out.print("Please enter a valid Day (1-31): ");
		}

		boolean isDayValid = false;
		
		boolean response = validateDay(Day, Month);
	    if ( response == true ) {
		  isDayValid = true;
		  return true;
	    }
	    else {
		  System.out.print("[" + Day + "]" + " is not a valid day value: ");
		  return false;
	    }
			  
	}
	public static boolean validateDay(int Day, int Month) {

		if ( Month == 4 || Month == 6 || Month == 9 || Month == 11 ) { // Validate Days when the month Apr, Jun, Sep, Nov
			if ( Day >= 1 && Day <= 30 ) {
				return true;
			}
			else {
				return false;
			}	
			
		} 
		
		else if ( Month == 2 ) { // Validate Days when the month 
			// Lets handle leap year
			int lastDay = 28;
			if (isLeapYear == true) {
				lastDay = 29;
			}
			
			// Validate days for reals
			if ( Day >= 1 && Day <= lastDay ) {
				return true;
			}
			else if (Day == 29 && isLeapYear == false ) {
				System.out.printf("[%d] February only has 29 days on a leap year\n", Year);
				return false;
			}
			else {
				return false;
			}
			
		} else {
			if ( Day >= 1 && Day <= 31) {
				return true;
			}
			else {
				return false;	
			}	
		}	
		
	}
	
	public static boolean getMonth() {

		boolean isMonthValid = false;
		
		boolean response = validateMonth(Month);
		if (response == true ) {
			isMonthValid = true;
			return true;
		}
		else {
			System.out.print("[" + Month + "]" + " is not valid month value");
			return false;
		}
	}
	
	public static boolean validateMonth(int Month) {
		if ( Month >= 1 && Month <= 12 ) {
			return true;
	    }
		else {
			return false;
		}
	}
	
	public static boolean getYear() {
		
		boolean isYearValid = false;
		
		boolean response = validateYear(Year);
		
		if ( response == true ) {
			isYearValid = true;
			return true;
		}
		else {
			System.out.println("[" + "Year" + "]" + " is not a valid value");
			return false;

		}
		
	}

	public static boolean validateYear(int Year) {
		
		// Check if Year is in the valid range
		if ( Year >= minYear && Year <= maxYear ) {
			// Check if Year is leap year and set the GLOBAL variable.
			checkIfYearIsLeapYear(Year);
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void checkIfYearIsLeapYear(int Year) {
		if ((( Year % 4 == 0 ) && (Year % 100 != 0 )) || ((Year % 4 == 0) && (Year % 100 == 0 ) && ( Year % 400 == 0))) {
			isLeapYear = true;
		} 
	   
	} // Method ends
	
	public static void dateFormatter() {
		
		switch(Month) {
		  case 1:
			  System.out.printf("January %d, %d", Day, Year);
			  break;
		  case 2:
			  System.out.printf("Feburary %d, %d", Day, Year);
			  break;
		  case 3:
			  System.out.printf("March %d, %d", Day, Year);
			  break;
		  case 4:
			  System.out.printf("April %d, %d", Day, Year);
			  break;
		  case 5:
			  System.out.printf("May %d, %d", Day, Year);
			  break;
		  case 6:
			  System.out.printf("July %d, %d", Day, Year);
			  break;
		  case 7:
			  System.out.printf("January %d, %d", Day, Year);
			  break;
		  case 8:
			  System.out.printf("January %d, %d", Day, Year);
			  break;
		  case 9:
			  System.out.printf("January %d, %d", Day, Year);
			  break;
		  case 10:
			  System.out.printf("January %d, %d", Day, Year);
			  break;
		  case 11:
			  System.out.printf("January %d, %d", Day, Year);
			  break;
		  case 12:
			  System.out.printf("January %d, %d", Day, Year);
			  break;
		  default:
			  System.out.println("Invalid Response Somewhere");
		}
	}
	
} // Class Ends

