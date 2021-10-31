package lab7;// ****************************************************************
// Circle.java
//
// Define a Circle class with methods to create and draw
// a circle of random size, color, and location.
//
// ****************************************************************


import java.awt.*;
import java.util.Random;

public class Circle {
    private int centerX, centerY;
    private int radius;
    private Color color;

    static Random generator = new Random();

    //---------------------------------------------------------
    // Creates a circle with center at point given, random radius and color
    //   -- radius 25..74
    //   -- color RGB value 0..16777215 (24-bit)
    //---------------------------------------------------------
    public Circle(Point point) {
        move(point);
    }

    //---------------------------------------------------------
    // Draws circle on the graphics object given
    //---------------------------------------------------------
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }

    public Color generateColor() {
        return new Color(Math.abs(generator.nextInt()) % 16777216);
    }

    public int generateRadius() {
        return Math.abs(generator.nextInt()) % 50 + 25;
    }

    public void move(Point p, boolean onlyMovePosition) {
        centerX = p.x;
        centerY = p.y;
        if (!onlyMovePosition) {
            color = generateColor();
            radius = generateRadius();
        }
    }

    public void move(Point p) {
        move(p, false);
    }

    public boolean isInside(Point p) {
        double dis = Math.sqrt(Math.pow(this.centerX - p.x, 2) + Math.pow(this.centerY - p.y, 2));
        return dis <= this.radius;
    }
}
