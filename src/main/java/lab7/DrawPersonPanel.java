package lab7;// *******************************************************************
//   DrawPersonPanel.java
//
//   An program that uses the Graphics draw methods to draw a person.
// *******************************************************************
import javax.swing.JPanel;
import java.awt.*;
public class DrawPersonPanel extends JPanel
{
    private final int WIDTH = 600;
    private final int HEIGHT = 800;

    private int[] shirtX = {60,0,20,60,50,130,120,160,180,120};
    private int[] shirtY = {100,150,180,160,250,250,160,180,150,100};

    private int[] pantsX = {50, 30, 70, 90, 110,150, 130};
    private int[] pantsY = {250, 400, 400, 310, 400, 400, 250};

    private int[] hairsX = {50, 30, 70, 90, 110,150, 130};
    private int[] hairsY = {250, 400, 400, 310, 400, 400, 250};
    //--------------------------------------
    //  Constructor: Set up the panel.
    //--------------------------------------
    public DrawPersonPanel()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    //--------------------------------------
    //   Draw person
    //--------------------------------------
    public void paintComponent (Graphics page)
    {
        page.setColor(Color.blue);
        page.fillPolygon(shirtX, shirtY, shirtX.length);

        page.setColor(Color.orange);
        page.fillPolygon(pantsX, pantsY, pantsX.length);

        page.setColor(Color.black);
        page.fillOval(55, 50, 70, 70);

        page.setColor(Color.green);


    }
}
