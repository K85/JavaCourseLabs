package lab2;

// *******************************************************************
// Average.java
//
// Read three integers from the user and print their average
// *******************************************************************
import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    int val1, val2, val3;
    double average;
    Scanner scan = new Scanner(System.in);
    // get three values from user
    System.out.println("Please enter three integers and " + "I will compute their average");
    val1 = scan.nextInt();
    val2 = scan.nextInt();
    val3 = scan.nextInt();
    // compute the average
    average = (double) (val1 + val2 + val3) / 3;
    // print the average
    System.out.println(average);
  }

}
