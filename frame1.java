import java.awt.*;
class frame1 extends Frame
{
	frame1()
	{	
		Button b1=new Button("Click me");
		b1.setBounds(80,90,60,30);
		
		add(b1);
	}
	public static void main(String args[])
	{
		frame1 f=new frame1();
		f.setVisible(true);
		f.setTitle("Frame");
		f.setSize(300,300);
	}
}