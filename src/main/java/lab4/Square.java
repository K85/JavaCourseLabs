package lab4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Square {

  private static Random generator = new Random();
  private int length;
  private int x;
  private int y;
  private Color color;

  public Square() {
    this.length = generator.nextInt(101) + 100;
    this.x = generator.nextInt(401);
    this.y = generator.nextInt(401);
    this.color = Color.getHSBColor(generator.nextFloat(), generator.nextFloat(), generator.nextFloat());
  }

  public void paint(Graphics g) {
    g.setColor(this.color);
    g.drawRect(this.x, this.y, this.length, this.length);
  }
}
