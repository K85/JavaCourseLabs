package lab5;

//********************************************************* 
// VoteCounterPanel.java   
// 
// Panel for the GUI that tallies votes for two candidates, 
// Joe and Sam. 
//********************************************************* 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel {
  private int votesForJoe;
  private int votesForSam;
  private final JButton joe;
  private final JButton sam;
  private final JLabel labelJoe;
  private final JLabel labelSam;
  private final JLabel labelResult;

  // ----------------------------------------------
  // Constructor: Sets up the GUI.
  // ----------------------------------------------
  public VoteCounterPanel() {
    votesForJoe = 0;
    votesForSam = 0;

    joe = new JButton("Vote for Joe");
    joe.addActionListener(new VoteButtonListener());
    sam = new JButton("Vote for Sam");
    sam.addActionListener(new VoteButtonListener());

    labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
    labelSam = new JLabel("Votes for Sam: " + votesForSam);
    labelResult = new JLabel("Winner: None", JLabel.CENTER);
    labelResult.setPreferredSize(new Dimension(300, 10));
    add(joe);
    add(labelJoe);
    add(sam);
    add(labelSam);
    add(labelResult);
    setPreferredSize(new Dimension(300, 80));
    setBackground(Color.cyan);
  }

  // ***************************************************
  // Represents a listener for button push (action) events
  // ***************************************************
  private class VoteButtonListener implements ActionListener {
    // ----------------------------------------------
    // Updates the appropriate vote counter when a
    // button is pushed for one of the candidates.
    // ----------------------------------------------
    public void actionPerformed(ActionEvent event) {
      if (event.getSource() == joe) {
        votesForJoe++;
        labelJoe.setText("Votes for Joe: " + votesForJoe);
      } else if (event.getSource() == sam) {
        votesForSam++;
        labelSam.setText("Votes for Sam: " + votesForSam);
      }

      if (votesForJoe == votesForSam)
        labelResult.setText("Winner: None");
      else if (votesForJoe > votesForSam)
        labelResult.setText("Winner: Joe");
      else
        labelResult.setText("Winner: Sam");
    }
  }
}
