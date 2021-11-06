package lab8;// **********************************************************
// CountDown.java
//
// Draws a digital display that counts down from 10. The
// display can be stopped or reset with a mouse click.
// **********************************************************

import javax.swing.*;

public class CountDown {
    private static final int DELAY = 200;
    private static Timer timer;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timer = new Timer(DELAY, null);
        timer.start();
        frame.getContentPane().add(new CountDownPanel(timer));

        frame.pack();
        frame.setVisible(true);
    }
}