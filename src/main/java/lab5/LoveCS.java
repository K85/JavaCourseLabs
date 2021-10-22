package lab5;

import java.util.Scanner;

// **************************************************************** 
//   LoveCS.java 
// 
//   Use a while loop to print many messages declaring your  
//   passion for computer science 
// **************************************************************** 

public class LoveCS {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int times = scan.nextInt();
    int sum = 0;
    int count = 1;
    while (count <= times) {
      System.out.println(count + " I love Computer Science!!");
      sum += count;
      count++;
    }

    System.out.println(String.format("Printed this message %d times, The sum of the numbers from %d to %d is %d", times,
        1, times, sum));
  }
}
