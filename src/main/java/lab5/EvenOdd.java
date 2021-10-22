package lab5;

//******************************************************************** 
//  EvenOdd.java       Author: Lewis/Loftus 
// 
//  Demonstrates the use of the JOptionPane class. 
//******************************************************************** 

import javax.swing.JOptionPane;

class EvenOdd {
  // -----------------------------------------------------------------
  // Determines if the value input by the user is even or odd.
  // Uses multiple dialog boxes for user interaction.
  // -----------------------------------------------------------------
  public static void main(String[] args) {
    String numStr, result;
    int num, again;

    do {
      numStr = JOptionPane.showInputDialog("Enter an integer: ");

      num = Integer.parseInt(numStr);

      result = "That sqrt is " + Math.sqrt(num);

      JOptionPane.showMessageDialog(null, result);

      again = JOptionPane.showConfirmDialog(null, "Do Another?");
    } while (again == JOptionPane.YES_OPTION);
  }
}
