package lab9_10;// ******************************************************************
//   SpeedControlPanel.java
//
//   The panel for the bouncing ball.  Similar to
//   ReboundPanel.java in Listing 8.16 in the text, except a circle
//   rather than a happy face is rebounding off the edges of the
//   window.
// ******************************************************************

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedControlPanel extends JPanel {
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int BALL_SIZE = 50;
    private final JSlider slider;
    private final JLabel label;
    private final JPanel panel;

    private final Circle bouncingBall;   // the object that moves
    private final Timer timer;
    private int moveX, moveY;      // increment to move each time

    // ---------------------------------------------
    //  Sets up the panel, including the timer
    //  for the animation
// ---------------------------------------------
    public SpeedControlPanel() {
        timer = new Timer(30, new ReboundListener());

        this.setLayout(new BorderLayout());
        bouncingBall = new Circle(BALL_SIZE);
        moveX = moveY = 5;

        // Set up a slider object here
        slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 30);
        slider.setMajorTickSpacing(40);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
//        slider.setAlignmentX(Component.CENTER_ALIGNMENT);
        slider.addChangeListener(new SlideListener());
        slider.setSnapToTicks(true);
        label = new JLabel("Timer Delay: " + slider.getValue());

        panel = new JPanel();
        panel.add(label);
        panel.add(slider);
        this.add(panel, BorderLayout.SOUTH);

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }

    // --------------------
    // Draw the ball
    // --------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        bouncingBall.draw(page);
    }

    // ***************************************************
    //   An action listener for the timer
    // ***************************************************
    public class ReboundListener implements ActionListener {
        // ----------------------------------------------------
// actionPerformed is called by the timer -- it updates
        // the position of the bouncing ball
        // ----------------------------------------------------
        public void actionPerformed(ActionEvent action) {
            bouncingBall.move(moveX, moveY);

            // change direction if ball hits a side
            int x = bouncingBall.getX();
            int y = bouncingBall.getY();
            if (x < 0 || x >= WIDTH - BALL_SIZE)
                moveX = moveX * -1;

            if (y <= 0 || y >= HEIGHT - BALL_SIZE - panel.getHeight())
                moveY = moveY * -1;
            repaint();
        }
    }

    // *****************************************************
    //   A change listener for the slider.
    // *****************************************************
    private class SlideListener implements ChangeListener {
        // -------------------------------------------------
        //  Called when the state of the slider has changed;
        //  resets the delay on the timer.
        // -------------------------------------------------
        public void stateChanged(ChangeEvent event) {
            int delay = slider.getValue();
            timer.setDelay(delay);
            label.setText("Timer Delay: " + delay);
        }
    }
}
