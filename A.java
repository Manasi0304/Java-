/*
<applet code="A"  height="300"  width="600" >
</applet>
*/
import java.awt.Font;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
public class A extends Applet
{
	public void paint(Graphics g)
	{
	        Font f1=new Font ("magneto",Font.BOLD,20);
	        g.setFont(f1);
 	      
	        g.setColor(Color.black);

	        g.drawRect(30,40,100,70);
	        g.setColor(Color.red);
	        g.drawString("hello alllllllllll ",50,50);
	}
}