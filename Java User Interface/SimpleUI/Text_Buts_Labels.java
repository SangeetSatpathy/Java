import javax.swing.*;
import java.awt.*;

class Text_Buts_Labels extends JFrame{
  public Text_Buts_Labels(){
    super("Text_Buts_Labels");
    setLookAndFeel();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,400);
    FlowLayout flo = new FlowLayout(); /*FlowLayout is a layout manager (the 
    simplest one). Layout managers decides the arrangements of components w/out
    specifiying. When you create a layout manager, you have to install it in 
    the frame, so you call JFrame's setLayout() method, which has the parameter
    of the layout manager to set.*/
    setLayout(flo);
    JButton but = new JButton("Click Here to go to amazon.com");//the JButton class is for buttons; the constructor called is the text displayed in the button.
    add(but); // this method of JFrame adds individual components
    but.setEnabled(true);//this shows whether the user can click the button or not.
    JLabel label= new JLabel("Web page address:",JLabel.LEFT);//labels user can't modify(text,graphics); to label other components; first parameter = the text/graphic to label, second parameter = which side the thing it's labeling should be on(so the side it won't be on);
    JTextField text= new JTextField(20);//text field for user to input characters; 1st parameter= # characters allowed
    text.setEditable(true);//whether the text field can be editable or not.
    JTextField website = new JTextField("www.netflix.com",29);
    add(label);
    add(text);
    add(website);
    String fav_web = website.getText();//getText() returns the letters that the user has in a string.
    setVisible(true);
    text.setText("Sangeet");//sets the text of a text field.
  }

  private void setLookAndFeel(){
    try{
      UIManager.setLookAndFeel("sun.com.java.swing.plaf.nimbus.NimbusLookAndFeel");
    }catch(Exception exc){
      //ignore
    }
  }

  public static void main(String[]arguments){
  }
}