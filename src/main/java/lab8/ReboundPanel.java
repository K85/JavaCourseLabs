package lab8;//********************************************************************
//  ReboundPanel.java       Author: Lewis/Loftus
//
//  Represents the primary panel for the Rebound program.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReboundPanel extends JPanel {
    private final int WIDTH = 300, HEIGHT = 200;
    private final int DELAY = 20, IMAGE_SIZE = 35;

    private ImageIcon image;
    private ImageIcon image2;
    private Timer timer;
    private int x, y, moveX, moveY;
    private int x2, y2, moveX2, moveY2;

    //-----------------------------------------------------------------
    //  Sets up the panel, including the timer for the animation.
    //-----------------------------------------------------------------
    public ReboundPanel() {
        timer = new Timer(DELAY, new ReboundListener());
        image = new ImageIcon("happyFace.gif");
        image2 = new ImageIcon("happyFace.gif");

        x = 50;
        y = 100;
        moveX = moveY = 3;

        x2 = 0;
        y2 = 0;
        moveX2 = 5;
        moveY2 = 8;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }

    //-----------------------------------------------------------------
    //  Draws the image in the current location.
    //-----------------------------------------------------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);
        image2.paintIcon(this, page, x2, y2);
    }

    //*****************************************************************
    //  Represents the action listener for the timer.
    //*****************************************************************
    private class ReboundListener implements ActionListener {
        //--------------------------------------------------------------
        //  Updates the position of the image and possibly the direction
        //  of movement whenever the timer fires an action event.
        //--------------------------------------------------------------
        public void actionPerformed(ActionEvent event) {
            /* item1 */
            x += moveX;
            y += moveY;

            if (x <= 0 || x >= WIDTH - IMAGE_SIZE)
                moveX *= -1;
            if (y <= 0 || y >= HEIGHT - IMAGE_SIZE)
                moveY *= -1;

            /* item2 */
            x2 += moveX2;
            y2 += moveY2;

            if (x2 <= 0 || x2 >= WIDTH - IMAGE_SIZE)
                moveX2 *= -1;
            if (y2 <= 0 || y2 >= HEIGHT - IMAGE_SIZE)
                moveY2 *= -1;

            /* collision avoid */
            if (Math.abs(x - x2) <= image.getIconWidth() / 2) {
                moveX *= -1;
                moveX2 *= -1;
            }

            if (Math.abs(y - y2) <= image.getIconHeight() / 2) {
                moveY *= -1;
                moveY2 *= -1;
            }


            repaint();
        }
    }

}