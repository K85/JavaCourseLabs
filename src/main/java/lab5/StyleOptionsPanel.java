package lab5;

//******************************************************************** 
//  StyleOptionsPanel.java       Author: Lewis/Loftus 
// 
//  Demonstrates the use of check boxes. 
//******************************************************************** 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {
  private int fontSize = 36;
  private int style = Font.PLAIN;
  private JLabel saying;
  private JCheckBox bold, italic;
  private JRadioButton small, medium, large;
  private ButtonGroup buttonGroup;

  // -----------------------------------------------------------------
  // Sets up a panel with a label and some check boxes that
  // control the style of the label's font.
  // -----------------------------------------------------------------
  public StyleOptionsPanel() {
    saying = new JLabel("Say it with style!");
    saying.setFont(new Font("Helvetica", style, fontSize));

    bold = new JCheckBox("Bold");
    bold.setBackground(Color.cyan);
    italic = new JCheckBox("Italic");
    italic.setBackground(Color.cyan);
    StyleListener listener = new StyleListener();
    bold.addItemListener(listener);
    italic.addItemListener(listener);

    small = new JRadioButton("Small Font");
    small.setBackground(Color.cyan);
    small.addItemListener(listener);
    medium = new JRadioButton("Medium Font");
    medium.setBackground(Color.cyan);
    medium.addItemListener(listener);
    large = new JRadioButton("Large Font");
    large.setBackground(Color.cyan);
    large.addItemListener(listener);
    large.setSelected(true);

    buttonGroup = new ButtonGroup();
    buttonGroup.add(small);
    buttonGroup.add(medium);
    buttonGroup.add(large);

    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    this.setLayout(gbl);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(saying, gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(bold, gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(italic, gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(small, gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(medium, gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(large, gbc);

    setBackground(Color.cyan);
    setPreferredSize(new Dimension(300, 100));
  }

  // *****************************************************************
  // Represents the listener for both check boxes.
  // *****************************************************************
  private class StyleListener implements ItemListener {
    // --------------------------------------------------------------
    // Updates the style of the label font style.
    // --------------------------------------------------------------
    public void itemStateChanged(ItemEvent event) {
      style = Font.PLAIN;

      if (bold.isSelected())
        style = Font.BOLD;

      if (italic.isSelected())
        style += Font.ITALIC;

      if (small.isSelected())
        fontSize = 12;

      if (medium.isSelected())
        fontSize = 24;

      if (large.isSelected())
        fontSize = 36;

      saying.setFont(new Font("Helvetica", style, fontSize));
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Vote Counter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    StyleOptionsPanel styleOptionsPanel = new StyleOptionsPanel();

    frame.getContentPane().add(styleOptionsPanel);

    frame.pack();
    frame.setVisible(true);
  }
}
