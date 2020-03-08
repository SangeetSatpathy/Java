import java.awt.*;
import javax.swing.*;
//The BoxLayout manager makes it possible to stack components in a single row horizontally or vertically(using BoxLayout.X_AXIS or BoxLayout.Y_AXIS). The BoxLayout is used inside a JPanel or something of the sort, which in turn is inside the frame.
public class BoxCrisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public BoxCrisis() {
        super("BoxCrisis");
        setLookAndFeel();
        setSize(348, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        BoxLayout box = new BoxLayout(pane,BoxLayout.Y_AXIS);// 1st parameter = the object of the container or panel; 2nd parameter = the direction it is stacked - horizontally or vertically(X_AXIS or Y_AXIS)
        pane.setLayout(box);//you have to set the layout of the PANE, NOT the FRAME (since the BoxLayout is for JPanels)
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame Others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        pane.add(panicButton);//call the add method of the JPanel to add the buttons to IT.
        pane.add(dontPanicButton);
        pane.add(blameButton);
        pane.add(mediaButton);
        pane.add(saveButton);
        add(pane);//at the end, add the whole JPanel to the Frame.
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