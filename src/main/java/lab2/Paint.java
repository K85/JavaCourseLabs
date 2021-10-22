package lab2;

//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint {
  public static void main(String[] args) {
    final int COVERAGE = 350; // paint covers 350 sq ft/gal
    double length, width, height;
    double totalSqFt;
    double paintNeeded;
    System.out.println("Enter: length, width, height");
    Scanner scan = new Scanner(System.in);
    length = scan.nextDouble();
    width = scan.nextDouble();
    height = scan.nextDouble();

    totalSqFt = (length * width) + 2 * ((length * height) + (width * height));

    // Feature
    System.out.println("Enter: doorAmount, windowAmount");
    int doorAmount;
    int windowAmount;
    doorAmount = scan.nextInt();
    windowAmount = scan.nextInt();
    totalSqFt -= (doorAmount * 20 + windowAmount * 15);
    // Answer
    paintNeeded = totalSqFt / 350;
    System.out.println(String.format("the value of legnth = %.2f, width = %.2f, height = %.2f and paintNedded is %.2f",
        length, width, height, paintNeeded));

  }
}
