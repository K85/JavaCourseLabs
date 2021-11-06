package lab8;// **********************************************************
// CountDownPanel.java
//
// Panel for a digital display that counts down from 10.
// The display can be stopped or reset with a mouse click.
// **********************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CountDownPanel extends JPanel {
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int DISPLAY_WIDTH = 150;
    private final int DISPLAY_HEIGHT = 100;
    private final int DELAY = 200;
    private final int COUNT_START = 10;
    private DigitalDisplay clock;
    private Timer timer;

    // ---------------------------------------------------------
// Set up the applet.
// ---------------------------------------------------------
    public CountDownPanel(Timer countdown) {
// Set up the timer
        setBackground(Color.blue);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        clock = new DigitalDisplay(COUNT_START, WIDTH / 2 - DISPLAY_WIDTH,
                HEIGHT / 2 - DISPLAY_HEIGHT,
                DISPLAY_WIDTH, DISPLAY_HEIGHT);
        this.timer = countdown;
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clock.decrement();
                if (clock.getVal() == 0) {
                    timer.stop();
                }
                clock.draw(getGraphics());
            }
        });


        super.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (clock.getVal() == 0) {
                    clock.reset(10);
                    timer.start();
                } else {
                    if (timer.isRunning()) timer.stop();
                    else timer.start();
                }
            }
        });


    }

    // ----------------
// draw the clock
// ----------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        clock.draw(page);
    }
}


