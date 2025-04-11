import java.awt.*;
import java.awt.event.*;
class event2 extends Frame implements ActionListener 
{
	TextField tf1;
	TextField tf2;
	
	Button btn1;
	
	event2()
	{
	 	 tf1= new TextField();
		 tf2= new TextField();
		 btn1= new Button("COPY");
		 setLayout(null);
		 tf1.setBounds(60,50,170,20);
		 btn1.setBounds(90,90,80,20);
		 tf2.setBounds(60,125,170,20);
		 add(tf1);
		 add(btn1);
		 add(tf2);
                   		
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
			tf2.setText(s1);
			tf2.setEditable(false);
			 
		}
	public static void main(String args[])
		{
			event2 e1= new event2();
			e1.setSize(300,300);
			e1.setVisible(true);
			e1.setTitle("event hw1");
		}
}


