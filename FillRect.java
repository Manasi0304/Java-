import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="FillRect"  height="300"  width="600" >
</applet>
*/
public class FillRect extends Applet implements ActionListener
{
	
	public void paint(Graphics g)
	{
		 g.fillRect(30,40,100,70);
		
	}	
	public FillRect()
	{
		 setLayout(null);
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		
		Button btn1=new Button();
		Button btn2=new Button();
		
		Label lb1=new Label("Red");
		Label lb2= new Label("Green");
		Label lb3=new Label("Blue");
		
		lb1.setBounds(50,100,100,200);
		lb2.setBounds(70,120,100,200);
		lb3.setBounds(80,140,100,200);

		add(tf1);
		add(tf2);
		add(tf3);
		add(btn1);
		add(btn2);
		add(lb1);
		add(lb2);
		add(lb3);
		


		
	}
	public void actionPerformed(ActionEvent ae)
	{
	}
}












