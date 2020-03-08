import javax.swing.*;

public class SalutonFrame extends JFrame {
  public SalutonFrame(){
    //in the constructor, you have to set up the title of the frame, the size of the frame, the frame's look and feel, define what happens when a user closes the frame,and call a constructor of the superclass(JFrame)
    
    super("All Me"); // the constructor of JFrame, with the constructor of the title - you could also just do setTitle();
    
    setLookAndFeel(); //look and feel(appearance/visual theme) - one argument: the full name of the look and feel's 
    //java 7 introduces a look and feel called Nimbus

    setSize(350,100); // the size of the (width, length) in pixels
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// what to do when closed: EXIT_ON_CLOSE, DISPOSE_ON_CLOSE(close programming but keep running application), DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE(hide the frame but continue running application)
    
    setVisible(true);//shows or hides component depending on value of boolean
  }

  private void setLookAndFeel(){
    try{
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//this block of code makes a new method in the class called setLookAndFeel, where it calls the class UIManager's method setLookAndFeel(), with the parameter of NimbusLookAndFeel, which is the appearance used.
    } catch (Exception exc){
      //ignore error
    }
  }

  public static void main(String[]arguments){
    
  }
}