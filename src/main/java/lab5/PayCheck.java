package lab5;

import javax.swing.JOptionPane;

public class PayCheck {
  public static void main(String[] args) {

    double workHours, hourlyPay;
    double totalPay;
    int again;
    do {
      workHours = Double.parseDouble(JOptionPane.showInputDialog("Enter work hours: "));
      hourlyPay = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay: "));

      if (workHours > 40) {
        totalPay = 40 * hourlyPay + (1.5 * (workHours - 40) * hourlyPay);
      } else {
        totalPay = workHours * hourlyPay;
      }

      JOptionPane.showMessageDialog(null, "total pay is " + totalPay);

      again = JOptionPane.showConfirmDialog(null, "Do Another?");
    } while (again == JOptionPane.YES_OPTION);
  }
}
