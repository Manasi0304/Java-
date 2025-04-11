import java.awt.*;
import java.awt.Frame;

public class Practical extends Frame
{
	Practical() 
	{
		setLayout(null);
		Label l1 = new Label("Welcome");
		l1.setBounds(30,40,70,90);
		add(l1);

	}

	public static void main (String args[])
	{
		Practical p1 = new Practical();
		p1.setTitle("Java Frame");
		p1.setSize(300,300);
		p1.setVisible(true);
	}
}