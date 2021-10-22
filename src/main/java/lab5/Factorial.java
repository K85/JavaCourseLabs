package lab5;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {

      System.out.println("enter the num of factorial: ");
      int fact = scan.nextInt();

      // check negative
      if (fact < 0) {
        System.out.println("negative num is nto allowed !");
        continue;
      }

      // calc fact
      int ans = 1;
      while (fact > 0)
        ans *= fact--;

      System.out.println("the answer: " + ans);
    }

  }
}
