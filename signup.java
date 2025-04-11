import java.awt.*;
import java.applet.*;
/*<applet code="signup" width=300 height=300>
</applet>*/
public class signup extends Applet
{

	public void init()
	{
	    	setLayout(null);
		Font f1=new Font("aerial",Font.BOLD,13);	
		Label lb1=new Label("full name:",Label.LEFT);
		Label lb2=new Label("mob no.:",Label.LEFT);
		Label lb3=new Label("email:");
		Label lb4=new Label("password:");
		Label lb5=new Label("confirm password:");
		lb1.setFont(f1);
		lb2.setFont(f1);
		lb3.setFont(f1);
		lb4.setFont(f1);
		lb5.setFont(f1);
		lb1.setBounds(35,40,110,30);
 		lb2.setBounds(35,90,110,30);
		lb3.setBounds(35,140,110,30);
		lb4.setBounds(35,190,110,30);
		lb5.setBounds(35,240,115,30);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);

		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		TextField tf4=new TextField();
		TextField tf5=new TextField();
		tf1.setBounds(170,40,220,25);
		tf2.setBounds(170,90,220,25);
		tf3.setBounds(170,140,220,25);
		tf4.setBounds(170,190,220,25);
		tf5.setBounds(170,240,220,25);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		tf4.setEchoChar('*');
		tf5.setEchoChar('*');

		Button btn1= new Button();
		Button btn2= new Button("sign up");
		btn1.setLabel("reset");
		Font f2=new Font("aerial",Font.BOLD,15);	
		btn1.setFont(f2);
		btn2.setFont(f2);
		btn1.setBackground(Color.CYAN);
		btn2.setBackground(Color.CYAN);
		
		btn1.setSize(80,25);
		btn2.setSize(80,25);
		btn1.setLocation(200,350);
		btn2.setLocation(300,350);
		add(btn1);
		add (btn2);
		setVisible(true);
		
	}
	public void paint(Graphics g)
	{
		Font f1=new Font("Serif",Font.PLAIN,15);
		g.setFont(f1);
		g.setColor(Color.RED);
		g.drawString("--manasi bharati",450,455);
		g.setColor(Color.BLACK);
		
	}

}