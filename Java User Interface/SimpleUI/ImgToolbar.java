import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//the ImageIcon class allows you to use small images used to identify buttons and other parts of an interface. It is part of the java.swing package.
//ImageIcon contructor :    ImageIcon(String) - the String is the name of the file or the location of the file, including the type of format(must be GIF, JPEG, or PNG).
//You can use ImageIcons AS labels and buttons by using JLabels contructor with the ImageIcon object as the argument. You can also have 2 parameters - (String-the label, String the Image file)

//The JToolBar class is one that is a toolbox - it holds a bunch of components into a row or column, usually icons, in a toolbar-like manner. (not widely used)
//the constructors for JToolbar:   JToolBar() - makes a horizontal toolbar ; JToolBar(int direction) - SwingConstants.HORIZONTAL or SwingConstants.VERTICAL.
//for the toolbar to be dockable (movable from one side to another), it needs to be in BORDERLAYOUT. There are some other requirements, but complicated, GOOGLE IT.
public class ImgToolbar extends JFrame {
    public ImgToolbar() {
        super("ImgToolbar");
        setLookAndFeel();
        setSize(370, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // build toolbar buttons
        ImageIcon image1 = new ImageIcon("newfile.gif");
        JButton button1 = new JButton(image1);
        ImageIcon image2 = new ImageIcon("openfile.gif");
        JButton button2 = new JButton(image2);
        ImageIcon image3 = new ImageIcon("savefile.gif");
        JButton button3 = new JButton(image3);
        
        // build toolbar
        JToolBar bar = new JToolBar();
        bar.add(button1);
        bar.add(button2);
        bar.add(button3);
        
        // build text area
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        
        // create frame
        BorderLayout border = new BorderLayout();
        setLayout(border);
        add(bar, BorderLayout.NORTH);
        add(scroll,BorderLayout.CENTER);
        setVisible(true);
    }
    
     private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }