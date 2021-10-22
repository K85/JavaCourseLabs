package lab5;

import java.text.NumberFormat;

public class ChargeAccountStatement {

  public static double calc(double previousBalance, double additionalCharges) {

    // calc
    double interest;

    if (previousBalance == 0)
      interest = 0;
    else
      interest = (previousBalance + additionalCharges) * 0.2;

    double newBalance = previousBalance + additionalCharges + interest;
    if (newBalance < 50.0)
      return newBalance;
    else if (newBalance >= 50.0 && newBalance <= 300)
      return 50.0;
    double minimumPayment = newBalance * 0.20;

    // print
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    System.out.println("CS CARD International Statement\n");
    System.out.println("===================================");
    System.out.println("Previous Balance: " + numberFormat.format(previousBalance));
    System.out.println("Additional Charges: " + numberFormat.format(additionalCharges));
    System.out.println("Interest: " + numberFormat.format(interest));
    System.out.println("New Balance: " + numberFormat.format(newBalance));
    System.out.println("Minimum Payment: " + numberFormat.format(minimumPayment));

    return minimumPayment;
  }

  public static void main(String[] args) {
    calc(100, 1000);
  }

}
