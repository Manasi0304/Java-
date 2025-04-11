import java.awt.*;
class loginhw1 extends Frame 
{
	 loginhw1()
	{ 
	    		setLayout(null);
			Font f1=new Font("aerial",Font.BOLD,13);	
			Label lb1=new Label("Enter Username:",Label.LEFT);
			Label lb2=new Label("Enter Password:",Label.LEFT);
			TextField tf1=new TextField();
			TextField tf2=new TextField();
			
			lb1.setFont(f1);
			lb2.setFont(f1);
			
			lb1.setBounds(80,100,180,20);
 			lb2.setBounds(80,150,180,20);
			tf1.setBounds(260,100,220,25);
		 	tf2.setBounds(260,150,220,25);
			add(lb1);
			add(lb2);
			add (tf1);
			add(tf2);
			Button btn1= new Button();
			Button btn2= new Button("SIGN IN");
			btn1.setLabel("RESET");
			Font f2=new Font("aerial",Font.BOLD,15);	
			btn1.setFont(f2);
			btn2.setFont(f2);
			btn1.setBackground(Color.CYAN);
			btn2.setBackground(Color.CYAN);
		
			btn1.setBounds(100,220,90,25);
			
			btn2.setBounds(250,220,90,25);
			add(btn1);
			add(btn2);
			setVisible(true);
			
			tf2.setEchoChar('*');
			 Label lb5=new Label("--manasi bharati",Label.LEFT);
			Font f3=new Font("Serif",Font.PLAIN,15);
			lb5.setBounds(350,300,210,20);
			lb5.setFont(f3);
			lb5.setForeground(Color.RED);
			add(lb5);
			
		
		

	}
	public static void main(String args[])
	{
		loginhw1 l=new loginhw1();
		l.setVisible(true);
		l.setTitle("login form");
		l.setSize(500,500);
	}
}


