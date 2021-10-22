package lab5;

// ********************************************************** 
//   Temps.java 
// 
//   This program reads in a sequence of hourly temperature  
//   readings (beginning with midnight) and prints the maximum 
//   temperature (along with the hour, on a 24-hour clock, it  
//   occurred) and the minimum temperature (along with the hour 
//   it occurred). 
// ********************************************************** 

import java.util.Scanner;

public class Temps {
  // ----------------------------------------------------
  // Reads in a sequence of temperatures and finds the
  // maximum and minimum read in.
  // ----------------------------------------------------
  public static void main(String[] args) {
    final int HOURS_PER_DAY = 4;

    int temp; // a temperature reading

    Scanner scan = new Scanner(System.in);

    // print program heading
    System.out.println();
    System.out.println("Temperature Readings for 24 Hour Period");
    System.out.println();

    int minTemp = Integer.MAX_VALUE;
    int timeOfMinTemp = -1;
    int maxTemp = Integer.MIN_VALUE;
    int timeOfMaxTemp = -1;

    for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
      System.out.println("Enter the temperature reading at " + hour + " hours: ");
      temp = scan.nextInt();
      if (temp < minTemp) {
        minTemp = temp;
        timeOfMinTemp = hour;
      }

      if (temp > maxTemp) {
        maxTemp = temp;
        timeOfMaxTemp = hour;
      }

    }

    // Print the results

    System.out.println(String.format("max temp %d appears at %d hour", maxTemp, timeOfMaxTemp));
    System.out.println(String.format("min temp %d appears at %d hour", minTemp, timeOfMinTemp));
  }
}
