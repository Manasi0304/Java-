import java.awt.*; 
 import java.awt.event.*; 
 class JavaExampleTextEvent extends Frame implements TextListener 
 { 
   TextField Txt; 
   public JavaExampleTextEvent() 
     { 
       createAndShowGUI(); 
     } 
       private void createAndShowGUI() 
         { 
           setTitle("Example of Text Listener"); 
           setLayout(new FlowLayout()); 
           Txt=new TextField(20); 
           Txt.addTextListener(this); 
           add(Txt); 
           setSize(400,400); 
           setVisible(true); 
         } 
           public void textValueChanged(TextEvent Evnt) 
           { 
              setTitle(Txt.getText()); 
           } 
              public static void main(String aa[]) 
              { 
                 new JavaExampleTextEvent(); 
              } 
  }