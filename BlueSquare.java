//Prompt: “write a java program that draws a blue square starting at (200,70) with a width of 80 pixels and a height of 80 pixels.”

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Color;

public class BlueSquare extends JApplet
{
   //Color blue = Color.BLUE;
   public void paint (Graphics g)
   {
      super.paint(g);
      g.setColor(Color.BLUE);
      g.drawRect(200, 70, 80, 80);
      g.fillRect(200, 70, 80, 80);
   
   }
   
}