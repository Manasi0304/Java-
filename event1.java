import java.awt.*;
import java.awt.event.*;
class event1 extends Frame implements ActionListener 
{
	TextField tf1;
	TextField tf2;
	TextField tf3;
	Button btn1;
	
	event1()
	{
	 	 tf1= new TextField();
		 tf2= new TextField();
		 btn1= new Button("ADD");
		 tf3= new TextField();
		 setLayout(null);
		 tf1.setBounds(60,50,170,20);
		 tf2.setBounds(60,80,170,20);
		 btn1.setBounds(90,125,80,20);
		 tf3.setBounds(60,155,170,20);
	
		 add(tf1);
		 add(tf2);
		 add(btn1);
                   		 add(tf3);
		 btn1.addActionListener(this);
		btn1.setBackground(Color.CYAN);
		 Label lb5=new Label("--manasi bharati",Label.LEFT);
			Font f3=new Font("Serif",Font.PLAIN,15);
			lb5.setBounds(150,250,210,20);
			lb5.setFont(f3);
			lb5.setForeground(Color.RED);
			add(lb5);
	}
 	public void actionPerformed(ActionEvent ae)
		{
			String s1= tf1.getText();
			String s2= tf2.getText();
			int a= Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c= a+b;
			tf3.setText(" " +c);
			tf3.setVisible(true);
			 
		}
	public static void main(String args[])
		{
			event1 e1= new event1();
			e1.setSize(300,300);
			e1.setVisible(true);
			e1.setTitle("event hw1");
		}
}
















