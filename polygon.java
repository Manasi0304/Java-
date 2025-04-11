/*
<applet code="polygon"  height="300"  width="600" >
</applet>
*/
import java.awt.Font;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
public class polygon extends Applet
{
	 int x[]={30,175,330,175};
	 int y[]={15,45,15,175};
	public void paint(Graphics g)
	{
	        Font f1=new Font ("Modern No.20",Font.BOLD,22);
	        g.setFont(f1);
 	        g.fillPolygon(x,y,4);
	        g.setColor(Color.red);
	        g.drawString("hiiii ",95,70);
	}
}