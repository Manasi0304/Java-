import java.awt.*;
public Class borderlayoutdemo extends frame 
{
	public borderlayoutdemo()
	{
		BorderLayout b=new BorderLayout();
		setLayout(b);
		Button btn1=new Button("TOP-NORTH");
		Button btn2=new Button("BOTTOM-SOUTH");
		Button btn3=new Button("RIGHT-EAST");
		Button btn4=new Button("LEFT-WEST");
		Button btn5=new Button("CENTER");

		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.SOUTH);
		add(btn3,BorderLayout.EAST);
		add(btn4,BorderLayout.WEST);
		add(btn5);
	}
	public static void main(String args[])
	{
		borderlayoutdemo bd=new borderlayoutdemo();
		bd.setSize(500,500);
		bd.setTitle("border layout demo ");
		bd.setVisible(true);	
	}


}