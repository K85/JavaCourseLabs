package lab4;

// ****************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student {
  // declare instance data
  public String name;
  public double test1Score;
  public double test2Score;

  // -----------------------------------------------
  // constructor
  // -----------------------------------------------
  public Student(String studentName) {
    this.name = studentName;
  }

  // -----------------------------------------------
  // inputGrades: prompt for and read in student's grades for test1 and test2.
  // Use name in prompts, e.g., "Enter's Joe's score for test1".
  // -----------------------------------------------
  public void inputGrades() {
    Scanner scanner = new Scanner(System.in);

    System.out.println(String.format("Enter %s's score for test1", this.name));
    this.test1Score = scanner.nextDouble();

    System.out.println(String.format("Enter %s's score for test2", this.name));
    this.test2Score = scanner.nextDouble();
  }

  // -----------------------------------------------
  // getAverage: compute and return the student's test average
  // -----------------------------------------------
  public double getAverage() {
    return (this.test1Score + this.test2Score) / 2;
  }

  // -----------------------------------------------
  // getName: print the student's name
  // -----------------------------------------------
  public String getName() {
    return this.name;
  }

  public String toString() {
    return String.format("Name = %s, Test1 = %.2f, Test2 = %.2f", this.name, this.test1Score, this.test2Score);
  }

  public void printAverage() {
    System.out.println(String.format("the average score of %s is %.2f", this.getName(), this.getAverage()));
  }
}
