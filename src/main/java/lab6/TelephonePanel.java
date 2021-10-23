package lab6;

//******************************************************
// TelephonePanel.java
//
// Lays out a (functionless) GUI like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//******************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeypadPanel extends JPanel {

  private final BufferPanel bufferPanel;

  public KeypadPanel(BufferPanel bufferPanel) {

    // bind bufferpanel
    this.bufferPanel = bufferPanel;

    char[] buttonNames = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};

    GridLayout gl = new GridLayout(4, 3);
    this.setLayout(gl);

    for (int i = 0; i < buttonNames.length; i++) {
      JButton jb = new JButton(String.valueOf(buttonNames[i]));
      jb.addActionListener(new TelephoneButtonListener());
      this.add(jb);
    }

  }


  class TelephoneButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
      JButton source = (JButton) event.getSource();
      KeypadPanel keypadPanel = (KeypadPanel) source.getParent();

      keypadPanel.bufferPanel.addBuffer(source.getText());
      keypadPanel.bufferPanel.updateBufferLabel();
    }
  }
}

class TitlePanel extends JPanel {
  public TitlePanel() {
    JLabel labelTelephone = new JLabel("Your Telephone: ");
    this.add(labelTelephone);
  }
}

class BufferPanel extends JPanel {
  public JLabel labelRecord = new JLabel();
  public String buffer = "";

  public void setBuffer(String buffer) {
    this.buffer = buffer;
  }

  public void addBuffer(String appendStr) {
    this.buffer += appendStr;
  }

  public void updateBufferLabel() {
    this.labelRecord.setText("Buffers: " + buffer);
    System.out.println("updateBufferLabel:" + this.labelRecord);
  }

  public BufferPanel() {
    this.updateBufferLabel();
    this.add(this.labelRecord);
  }
}

public class TelephonePanel extends JPanel {
  public TelephonePanel() {
    // set BorderLayout for this panel
    BorderLayout bl = new BorderLayout();
    this.setLayout(bl);
    this.setPreferredSize(new Dimension(800, 400));
    // create a JLabel with "Your Telephone" title
    // add title label to north of this panel
    this.add("North", new TitlePanel());
    // add buffer panel.
    BufferPanel bufferPanel = new BufferPanel();
    this.add("South", bufferPanel);
    // create panel to hold keypad and give it a 4x3 GridLayout
    this.add("Center", new KeypadPanel(bufferPanel));
  }
}
