package lab6;

import java.util.Random;

//******************************************************* 
// Account.java 
// 
// A bank account class with methods to deposit to, withdraw from, 
// change the name on, and get a String representation 
// of the account. 
//******************************************************* 

public class Account {
  private double balance;
  private String name;
  private final long acctNum;

  private static int numAccounts = 0;

  private static int depositTimes = 0;
  private static double depositAmount = 0;
  private static int withdrawTimes = 0; 
  private static double withdrawAmount =  0; 

  public void transfer(Account acct, double amount) {
    if (this.getAccountNumber() == acct.getAccountNumber()) return;
    if (this.balance < amount) return;

    this.balance -= amount;
    acct.deposit(amount);
  }

  public static void transfer(Account acct1, Account acct2, double amount) {
    acct1.transfer(acct2, amount);
  }

  public static void clearPerDayStatics() {
    Account.depositTimes = 0;
    Account.withdrawTimes = 0;
    Account.depositAmount = 0;
    Account.withdrawAmount = 0;
  }
  
  public static int getDepositTimes() {
    return Account.depositTimes;
  }

  public static double getDepositAmount(){
    return Account.depositAmount;
  }

  public static int getWithdrawTimes() {
    return Account.withdrawTimes;
  }

  public static double getWithdrawAmount() {
    return Account.withdrawAmount;
  }

  public static int getNumAccounts() {
    return Account.numAccounts;
  }

  public long getAccountNumber() {
    return this.acctNum;
  }

  public String getName() {
    return this.name;
  }

  public void close() {
    this.name += "CLOSED";
    this.balance = 0;
    Account.numAccounts--;
  }

  public static Account consolidate(Account acct1, Account acct2) {

    if (acct1.acctNum == acct2.acctNum) {
      System.out.println("acct1 equals acct2 !");
      return null;
    }
    if (!acct1.name.equals(acct2.name)) {
      System.out.println("different names !");
      return null;
    }

    Account newAccount = new Account(acct1.getBalance() + acct2.getBalance(), acct1.getName(), Account.numAccounts + 1);
    acct1.close();
    acct2.close();
    return newAccount;
  }

  // ----------------------------------------------
  // Constructor -- initializes balance, owner, and account number
  // ----------------------------------------------
  public Account(double initBal, String owner, long number) {

    Account.numAccounts++; // auto record.

    this.balance = initBal;
    this.name = owner;
    this.acctNum = number;
  }

  public Account(double initBal, String owner) {
    this(initBal, owner, new Random().nextInt(10000));
  }

  public Account(String owner) {
    this(0, owner);
  }

  // ----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  // ----------------------------------------------
  public void withdraw(double amount) {
    if (balance >= amount) {
      Account.withdrawTimes++;
      Account.withdrawAmount += amount;
      balance -= amount;
    }
    else
      System.out.println("Insufficient funds");
  }

  public void withdraw(double amount, double fee) {
    withdraw(amount + fee);
  }

  // ----------------------------------------------
  // Adds deposit amount to balance.
  // ----------------------------------------------
  public void deposit(double amount) {
    Account.depositTimes++;
    Account.depositAmount += amount;

    balance += amount;
  }

  // ----------------------------------------------
  // Returns balance.
  // ----------------------------------------------
  public double getBalance() {
    return balance;
  }

  // ----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  // ----------------------------------------------
  public String toString() {
    return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
  }

  public void printSummary() {
    System.out.println(this);
  }
}
