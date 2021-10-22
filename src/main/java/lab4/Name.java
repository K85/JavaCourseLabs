package lab4;

import java.util.Scanner;

public class Name {

  private String first;
  private String middle;
  private String last;

  public String getFirst() {
    return this.first;
  }

  public String getMiddle() {
    return this.middle;
  }

  public String getLast() {
    return this.last;
  }

  public String firstMiddleLast() {
    return String.format("%s %s %s", this.first, this.middle, this.last);
  }

  public String lastFirstMiddle() {
    return String.format("%s, %s %s", this.last, this.first, this.middle);
  }

  public boolean equals(Name another) {
    return this.firstMiddleLast().equals(another.firstMiddleLast());
  }

  public String initials() {
    return String.format("%s", this.first.substring(0, 1).toUpperCase() + 
        this.middle.substring(0, 1).toUpperCase() + this.last.substring(0, 1).toUpperCase());
  }

  public void inputObject() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter first name: ");
      this.first = scanner.nextLine();
      System.out.println("Enter middle name: ");
      this.middle = scanner.nextLine();
      System.out.println("Enter last name: ");
      this.last = scanner.nextLine();
  }

  public int length() {
    int ret = 0;
    for (char ch : this.firstMiddleLast().toCharArray())
      if (!Character.isWhitespace(ch))
        ret++;
    return ret;
  }

}
