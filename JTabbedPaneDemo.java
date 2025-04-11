import javax.swing.*;
import java.applet.*;
/*<applet code ="JTabbedPaneDemo" width=400 height=400>
</applet>
*/
public class JTabbedPaneDemo extends JApplet
{
    public void init()
    {
       
        JTabbedPane jtp=new JTabbedPane();
        jtp.addTab("languages", new LangPanel());
        jtp.addTab("colors",new colorspanel());
        add(jtp);
    }

    private void addTab(String languages, colorspanel colorspanel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class LangPanel extends JPanel
{
    public LangPanel()
    {
        JButton b1=new JButton("marathi");
        JButton b2=new JButton("hindi");
        JButton b3=new JButton("english");
        add(b1);
        add(b2);
        add(b3);
    }

   
}
class colorspanel extends JPanel
{
    
        public colorspanel()
        {
            JCheckBox cb1=new JCheckBox("red");
            add(cb1);
            JCheckBox cb2=new JCheckBox("green");
            add(cb2);
            
        }
                
    
}













