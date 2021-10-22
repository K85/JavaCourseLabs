package lab4;

import java.util.Scanner;

public class TestNames {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Name name1 = new Name();
    name1.inputObject();
    System.out.println(String.format("the F-M-L of name1 is %s", name1.firstMiddleLast()));
    System.out.println(String.format("the L-F-M of name1 is %s", name1.lastFirstMiddle()));
    System.out.println(String.format("the capticals of name1 is %s", name1.initials()));
    System.out.println(String.format("the length of name1 is %s", name1.length()));

    Name name2 = new Name();
    name2.inputObject();
    System.out.println(String.format("the F-M-L of name2 is %s", name2.firstMiddleLast()));
    System.out.println(String.format("the L-F-M of name2 is %s", name2.lastFirstMiddle()));
    System.out.println(String.format("the capticals of name2 is %s", name2.initials()));
    System.out.println(String.format("the length of name2 is %s", name2.length()));

    System.out.println(String.format("the name1 equals the name2 ? %b", name1.equals(name2)));
  }
}

