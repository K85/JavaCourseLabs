package lab2;

import java.util.Scanner;

//**********************************************************
// Circle.java
//
// Print the area of a circle with two different radii
//**********************************************************
public class Circle {
  public static void main(String[] args) {
    final double PI = 3.14159;
    int radius = 10;
    double area = PI * radius * radius;
    double circle = 2 * PI * radius;
    System.out.println("The area of a circle with radius " + radius + " is " + area);
    System.out.println("The circle of a circle with radius " + radius + " is " + circle);

    radius = 20;
    area = PI * radius * radius;
    circle = 2 * PI * radius;
    System.out.println("The area of a circle with radius " + radius + " is " + area);
    System.out.println("The circle of a circle with radius " + radius + " is " + circle);

    double newArea;
    double newCircle;
    Scanner scan = new Scanner(System.in);
    radius = scan.nextInt();
    newArea = PI * radius * radius;
    newCircle = 2 * PI * radius;
    System.out.println(String.format("your circle = %.2f and area = %.2f", newCircle, newArea));

  }
}
