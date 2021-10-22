package lab3;

import java.util.Scanner;

/*
 * IntWrapper.java
 * Copyright (C) 2021  <@TEETH>
 *
 * Distributed under terms of the MIT license.
 */

public class IntWrapper {

  public static void main(String[] args) {
    System.out.println("Enter your num: ");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    Integer integer = Integer.valueOf(num);

    System.out.println("bin: " + Integer.toBinaryString(integer));
    System.out.println("oct: " + Integer.toOctalString(integer));
    System.out.println("hex: " + Integer.toHexString(integer));

    System.out.println("min: " + Integer.MIN_VALUE);
    System.out.println("max: " + Integer.MAX_VALUE);

    System.out.println("enter 2 dec numbers. (2 lines)");
    String num1, num2;
    num1 = scan.next();
    num2 = scan.next();
    System.out.println("the sum: " + (Integer.valueOf(num1) + Integer.valueOf(num2)));

  }
}
