package lab6;

import java.util.Scanner;

/**
 * @author : 31729
 * @created : 2021-10-23
 **/

public class Comparisons {

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    // 3 strings.
    System.out.println("Please enter 3 strings: ");
    String str1, str2,str3;
    str1 = scanner.nextLine();
    str2 = scanner.nextLine();
    str3 = scanner.nextLine();
    System.out.println(Compare3.largest(str1, str2, str3));

    // 3 integers.
    System.out.println("Please enter 3 integers: ");
    Integer int1, int2, int3;
    int1 = scanner.nextInt();
    int2 = scanner.nextInt();
    int3 = scanner.nextInt();
    System.out.println(Compare3.largest(int1, int2, int3));
  }
}
