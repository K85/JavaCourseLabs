package lab5;

import java.awt.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RainBow extends JPanel {

  private static final Random generator = new Random();

  public Color getRandomColor() {
    Color color = Color.getHSBColor(generator.nextFloat(), generator.nextFloat(), generator.nextFloat());
    return color;
  }

  public void paint(Graphics g) {
    int centerX = this.getPreferredSize().width / 2;
    int centerY = this.getPreferredSize().height / 2;

    int curWidth = 700;
    int curHeight = 600;
    int steps = 100;

    for (int i = 0; i < 6; i++) {
      g.setColor(getRandomColor());
      g.fillArc(centerX - (curWidth / 2), centerY - (curHeight / 2), curWidth, curHeight, 0, 180);
      curWidth -= steps;
      curHeight -= steps;
    }
  }

  public RainBow() {
    setPreferredSize(new Dimension(1200, 800));
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(new RainBow());

    frame.pack();
    frame.setVisible(true);

  }

}
