package lab5;

//********************************************************* 
// VoteCounter.java 
// 
// Demonstrates a graphical user interface and event 
// listeners to tally votes for two candidates, Joe and Sam. 
//********************************************************* 
import javax.swing.JFrame;

public class VoteCounter2 {
  // ----------------------------------------------
  // Creates the main program frame.
  // ----------------------------------------------
  public static void main(String[] args) {
    int a = 0;
    a = 3;

    int abc = 0;

    JFrame frame = new JFrame("Vote Counter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(new VoteCounterPanel());

    frame.pack();
    frame.setVisible(true);
  }
}
