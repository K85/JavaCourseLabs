package lab7;// *******************************************************************
//   DrawPerson.java
//
//   An program that uses the Graphics draw methods to draw a person.
// *******************************************************************

import javax.swing.JFrame;

public class DrawPerson
{
    //-----------------------------------------------
    //  Creates the main frame for the draw program
    //-----------------------------------------------
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Draw Person");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new DrawPersonPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
