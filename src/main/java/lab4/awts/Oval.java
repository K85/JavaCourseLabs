package lab4.awts;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Oval extends JPanel {

  private static Random generator = new Random();
  private int length;
  private int x;
  private int y;
  private Color color;

  public Oval() {
    this.length = generator.nextInt(101) + 100;
    this.x = generator.nextInt(401);
    this.y = generator.nextInt(401);
    this.color = Color.getHSBColor(generator.nextFloat(), generator.nextFloat(), generator.nextFloat());
  }

  public void paint(Graphics g) {

    g.setColor(this.color);
    g.drawOval(this.x, this.y, this.length, this.length);

    System.out.println("circle construct: " + g);
  }
}
