package lab4;

//*********************************************************
// VoteCounterPanel.java
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sam.
//*********************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel {
  private int votesForJoe;
  private final JButton joe;
  private final JLabel labelJoe;

  private int votesForSam;
  private final JButton sam;
  private final JLabel labelSam;
  // ----------------------------------------------
  // Constructor: Sets up the GUI.
  // ----------------------------------------------
  public VoteCounterPanel() {
    votesForJoe = 0;
    joe = new JButton("Vote for Joe");
    joe.addActionListener(new JoeButtonListener());
    labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
    add(joe);
    add(labelJoe);

    votesForSam = 0;
    sam = new JButton("Vote for Sam");
    sam.addActionListener(new SamButtonListener());
    labelSam = new JLabel("Votes for Sam: " + votesForSam);
    add(sam);
    add(labelSam);
    setPreferredSize(new Dimension(300, 80));
    setBackground(Color.cyan);
  }

  private class JoeButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      votesForJoe++;
      labelJoe.setText("Votes for Joe: " + votesForJoe);
    }
  }
  private class SamButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      votesForSam++;
      labelSam.setText("Votes for Sam: " + votesForSam);
    }
  }
}
