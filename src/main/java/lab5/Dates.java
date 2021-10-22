package lab5;

// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ****************************************************************
import java.util.Scanner;

public class Dates {
  public static void main(String[] args) {
    int month, day, year; // date read in from user
    int daysInMonth; // number of days in month read in
    boolean monthValid, yearValid, dayValid; // true if input from user is valid
    boolean leapYear; // true if user's year is a leap year
    Scanner scan = new Scanner(System.in);
    // Get integer month, day, and year from user
    month = scan.nextInt();
    day = scan.nextInt();
    year = scan.nextInt();
    // Check to see if month is valid
    monthValid = (month >= 1 && month <= 12);
    // Check to see if year is valid
    yearValid = (year >= 1000 && year <= 1999);
    // Determine whether it's a leap year
    leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    // Determine number of days in month
    if (!monthValid)
      daysInMonth = 0;
    else {
      int table[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
      daysInMonth = table[month];
      if (month == 2 && leapYear)
        daysInMonth++;
    }
    // User number of days in month to check to see if day is valid
    dayValid = yearValid && monthValid;
    // Determine whether date is valid and print appropriate message
    if (monthValid && dayValid && yearValid)
      System.out.println("Date is valid");
    else
      System.out.println("Date is not valid.");
    System.out.println("leapYear = " + leapYear);
  }

}
