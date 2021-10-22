package lab4;

//*******************************************************
// Account.java
//
// A bank account class with methods // change the name on, charge a fee //*******************************************************
public class Account {
  private double balance;
  private String name;
  private long acctNum;

  public Account(double initBal, String owner, long number) {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  public void withdraw(double amount) {
    if (balance >= amount)
      balance -= amount;
    else
      System.out.println("Insufficient");
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public double getBalance() {
    return balance;
  }

  public String toString() {
    return String.format("name = %s, account number = %d, balance = %.2f", name, acctNum, balance);
  }

  public double chargeFee() {
    this.balance -= 10;
    return this.balance;
  }

  public void changeName(String newName) {
    this.name = newName;
  }
}
