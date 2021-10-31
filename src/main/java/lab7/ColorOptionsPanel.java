package lab7;// *************************************************************************
//  ColorOptionsPanel.java
//
//  Represents the user interface for the ColorOptions program that lets
//  the user change background color by selecting a radio button.
// *************************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorOptionsPanel extends JPanel {
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private Color[] color = new Color[NUM_COLORS];
    private JLabel heading;
    private JRadioButton[] jRadioButtons;

    // ------------------------------------------------------------------
    //  Sets up a panel with a label at the top and a set of radio buttons
    //  that control the background color of the panel.
    // ------------------------------------------------------------------
    public ColorOptionsPanel() {
        // Set up heading and colors
        heading = new JLabel("Choose the background color!");
        heading.setFont(new Font("Helvetica", Font.BOLD, FONT_SIZE));

        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;
        String[] colorNames = {"Yellow", "Cyan", "Red", "Green", "Magenta"};

        // Instantiate a ButtonGroup object and a ColorListener object
        ButtonGroup buttonGroup = new ButtonGroup();
        jRadioButtons = new JRadioButton[NUM_COLORS];
        for (int i = 0; i < jRadioButtons.length; i++) {
            jRadioButtons[i] = new JRadioButton(colorNames[i]);
            jRadioButtons[i].setContentAreaFilled(false);
            jRadioButtons[i].addActionListener(new ColorListener());
            buttonGroup.add(jRadioButtons[i]);
            this.add(jRadioButtons[i]);
        }
        jRadioButtons[0].setSelected(true);

        // Set up the panel
        add(heading);

        setBackground(Color.yellow);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    // **************************************************************
    //   Represents the listener for the radio buttons.
    // **************************************************************
    private class ColorListener implements ActionListener {
        // --------------------------------------------------------
        //  Updates the background color of the panel based on
        //  which radio button is selected.
        // --------------------------------------------------------
        public void actionPerformed(ActionEvent event) {
            for (int i = 0; i < NUM_COLORS; i++) {
                if (jRadioButtons[i].isSelected()) {
                    setBackground(color[i]);
                    break;
                }
            }
        }
    }
}
