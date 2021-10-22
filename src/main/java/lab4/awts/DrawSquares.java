package lab4.awts;

import javax.swing.*;
import java.awt.*;

public class DrawSquares extends JFrame {

  public DrawSquares() {
    this.setSize(1000, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setContentPane(new DrawPanel());
    this.setTitle("DrawSeuares Tools");
  }

//  class DrawPanel extends JPanel {
//    public void paint(Graphics g) {
//      for (int i = 0; i < 5; i++)
//        new Square().paint(g);
//    }
//  }

  public static void main(String[] args) {

    DrawSquares drawSquares = new DrawSquares();
    drawSquares.add(new Square());
    drawSquares.add(new Oval());

    drawSquares.add(new Square());


    drawSquares.setVisible(true);

  }

}
