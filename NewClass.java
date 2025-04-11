import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowEvent;

public class NewClass extends Frame implements WindowListener
{

	public NewClass()
	{
	    	setLayout(null);
		Font f1=new Font("aerial",Font.BOLD,13);	
		Label lb1=new Label("full name:",Label.LEFT);
		Label lb2=new Label("mob no.:",Label.LEFT);
		Label lb3=new Label("DOB:");
		Label lb4=new Label("Address");
		Label lb5=new Label("gender");
                Label lb6=new Label("Hobbies");
                Label lb7=new Label("class");
                Label lb8=new Label("Subject");
		lb1.setFont(f1);
		lb2.setFont(f1);
		lb3.setFont(f1);
		lb4.setFont(f1);
		lb5.setFont(f1);
                lb6.setFont(f1);
                lb7.setFont(f1);
                lb8.setFont(f1);
                
		lb1.setBounds(35,40,110,30);
 		lb2.setBounds(35,90,110,30);
		lb3.setBounds(35,140,110,30);
		lb4.setBounds(35,190,110,30);
		lb5.setBounds(35,240,115,30);
                lb6.setBounds(35,290,115,30);
                lb7.setBounds(35,340,115,30);
                lb8.setBounds(35,390,115,30);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
                add(lb6);
                add(lb7);
                add(lb8);

		TextField tf1=new TextField();
		TextField tf2=new TextField();
		
		tf1.setBounds(170,40,220,25);
		tf2.setBounds(170,90,220,25);
		
		add(tf1);
		add(tf2);
		
                Choice c1=new Choice();
                for(int i=1;i<=31;i++)
                {
                    c1.add(""+i);
                }
               
                c1.setBounds(170,140,50,20);
		add(c1);
                Choice c2=new Choice( );
               
                c2.add("Jan");
                c2.add("Feb");
                c2.add("March");
                c2.add("April");
                c2.add("May");
                c2.add("June");
                c2.add("July");
                c2.add("Aug");
                c2.add("Sept");
                c2.add("Oct");
                c2.add("Nov");
                c2.add("Dec");
                
                c2.setBounds(200,140,50,20);
                 add(c2);
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
		btn1.setLocation(400,550);
		btn2.setLocation(500,550);
		add(btn1);
		add (btn2);
		setVisible(true);
                addWindowListener(this);
		
	}
        public void windowDeactivated(WindowEvent e)
        {}
        public void windowActivated(WindowEvent e)
        {}
        public void windowClosed(WindowEvent e)
        { 
            }
        public void windowClosing(WindowEvent e)
        {
          dispose(); 
        }
        public void windowiconified(WindowEvent e)
        {}
        public void windowDeiconified(WindowEvent e)
        {}
        
	public static void main(String args[])
	{
		
		NewClass n= new NewClass() ;
                n.setVisible(true);
                n.setSize(800,800);
                n.setTitle("Registration form");
	}

    private void addWindowLitener(NewClass aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}