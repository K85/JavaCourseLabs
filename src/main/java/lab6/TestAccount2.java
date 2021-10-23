package lab6;

import java.util.ArrayList;
import java.util.Scanner;
import lab6.Account;

public class TestAccount2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter 3 names: ");

    Account[] accounts = new Account[3];

    for (int i = 0; i < 3; i++) {
      System.out.println("Please enter account name: ");
      String name = scanner.nextLine();
      accounts[i] = new Account(100, name);
      System.out.println(accounts[i]);
    }

    // close acct1.
    System.out.println("Close Account 1: ");
    accounts[0].close();

    // unite acct2 and acct3.
    Account acct2 = accounts[1];
    Account acct3 = accounts[2];
    Account ret = Account.consolidate(acct2, acct3);
    System.out.println("After Consolidate: ");
    System.out.println(ret);
  }
}
