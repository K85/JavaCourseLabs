package lab4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Square {

  private static final Random generator = new Random();
  private final int length;
  private final int x;
  private final int y;
  private final Color color;

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
