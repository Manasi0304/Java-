import java.awt.*
Class firstFrame extends Frame 
{
	 firstFrame()
	{ 
	    		setLayout(null);
			Font f1=new Font("aerial",Font.BOLD,13);	
			Label lb1=new Label("Enter Username:",Label.LEFT);
			Label lb2=new Label("Enter Password:",Label.LEFT);
			lb1.setFont(f1);
			lb2.setFont(f1);
			lb1.setBounds(40,40,110,30);
 			lb2.setBounds(40,90,110,30);
			add(lb1);
			add(lb2);
			Button btn1= new Button();
			Button btn2= new Button("submit");
			btn1.setLabel("reset");
			Font f2=new Font("aerial",Font.BOLD,15);	
			btn1.setFont(f2);
			btn2.setFont(f2);
			btn1.setBackground(Color.CYAN);
			btn2.setBackground(Color.CYAN);
		
			btn1.setSize(80,25);
			btn2.setSize(80,25);
			btn1.setLocation(150,150);
			btn2.setLocation(240,150);
			add(btn1);
			add (btn2);
			setVisible(true);
		
		
		

	}
	public static void main(String args[])
	{
		firstframe f=new firstFrame();
		f.setVisible(true);
		f.setTitle("my first frame");
		f.setSize(300,300);
	}
}


