import java.awt.*;
import javax.swing.*;
//The BorderLayout manager arranges components into the 5 directions : NORTH, SOUTH, EAST, WEST, and CENTER. BorderLayout devotes ALL the available space to the components, and the space that isn't devoted to the NORTH, SOUTH, EAST, and WEST directions are given to the CENTER components, which ususally has the most space. Like GridLayout, if the text goes off the area, it is represented by 3 periods.
public class BorderCrisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public BorderCrisis() {
        super("BorderCrisis");
        setLookAndFeel();
        setSize(348, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout bor = new BorderLayout();
        setLayout(bor);
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame Others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        add(panicButton,BorderLayout.NORTH);// the add() method has a 2nd parameter for the BorderLayout class - the area/direction where it is to be placed.
        add(dontPanicButton, BorderLayout.SOUTH);
        add(blameButton, BorderLayout.EAST);
        add(mediaButton, BorderLayout.WEST);
        add(saveButton, BorderLayout.CENTER);
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