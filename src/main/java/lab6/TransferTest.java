package lab6;

import java.util.Scanner;

public class TransferTest {
  public static void main(String[] args) {


    Account acct1 = new Account(5000, "Alice");
    Account acct2 = new Account(5000, "Bob");

    boolean keepGoing = true;
    Scanner scanner = new Scanner(System.in);
    while (true) {

      System.out.println("do you want to transfer ? (y/n)");
      String response = scanner.next();
      if (!response.equalsIgnoreCase("Y")) break;


      System.out.println("how much do you want to transfer? (money amount)");
      double amount;
      amount = scanner.nextDouble();

      System.out.println("1. transfer from acct1 to acct2");
      System.out.println("2. transfer from acct2 to acct1");
      response = scanner.next();
      if (Integer.parseInt(response) == 1) {
        Account.transfer(acct1, acct2, amount);
      } else {
        Account.transfer(acct2, acct1, amount);
      }

      System.out.println("After transfer: ");
      acct1.printSummary();
      acct2.printSummary();
    }

    System.out.println("Finally transfers.");
    acct1.printSummary();
    acct2.printSummary();
  }
}
