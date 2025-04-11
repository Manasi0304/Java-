import java.awt.event.*;
import java.awt.*;
class checkbox extends Frame implements ActionListener
{
	CheckboxGroup grmeal;
	Checkbox ch1,ch2,ch3;
	Button btn1;
	Label lb1 , lb2,lb3;
	
	 public checkbox()
	{
		 CheckboxGroup  grmeal= new CheckboxGroup();
	 	 ch1=new Checkbox("pizza",true,grmeal);
                                        ch2 = new Checkbox("burger",false,grmeal);
		ch3=new Checkbox("pastry",false,grmeal);
		 btn1= new Button("CHECK");
		 setLayout(null);
		ch1.setBounds(50,80,100,30); 
		ch2.setBounds(150,80,100,30); 
		ch3.setBounds(250,80,100,30); 
		 btn1.setBounds(150,150,90,30);
		lb1=new Label();
		lb2=new Label();
		lb3=new Label();
		 lb1.setBounds(50,200,100,30);
		 lb2.setBounds(150,200,100,30);
		 lb2.setBounds(250,200,100,30);
		 add(ch1);
		 add(ch2);
		 add(ch3);
		add(btn1);
		add(lb1);
		add(lb2);
		add(lb3);
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
			Checkbox temp=grmeal.getSelectedCheckbox();
			String s= temp.getLabel();
			lb1.setText("pizza is:checked"+s);
			lb2.setText("burger is:unchaked"+s);
			lb3.setText("pastry is :unchaked"+s);
			
		}
	public static void main(String args[])
		{
			event3 e1= new event3();
			e1.setSize(300,300);
			e1.setVisible(true);
			e1.setTitle("event hw3");
		}
}



