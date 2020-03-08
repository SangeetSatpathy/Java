import java.awt.*;
import javax.swing.*;
// the FlowLayout layout manager arranges items in order the way English is written - from left to right, and down a line once you run out of space. It centers all the components automatically if there is more than enough space. The text in buttons takes as much space as it needs to, so components are different sizes. THE FlowLayout has only ONE GUIDELINE for how it arranges the items - the SIZE of the container.
//Insets are arranging components that move other components away from the edges of a container. Insets is a class, and its contructor takes in four arguments - (top, left, bottom, right). Each of the arguments is a number (int) and is represented in pixels.
public class Crisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public Crisis() {
        super("Crisis");
        setLookAndFeel();
        setSize(348, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame Others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        add(panicButton);
        add(dontPanicButton);
        add(blameButton);
        add(mediaButton);
        add(saveButton);
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

    public static void main(String[] arguments) {
    }
}