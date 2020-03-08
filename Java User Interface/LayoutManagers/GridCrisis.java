//the GridLayout arranges the items in equal sizes. You specify the number of row and columns to make a grid on the container, where the GridLayout manager organizes everything into equal grids. If the text is bigger than the size of the component, it is represented by 3 periods.

import java.awt.*;
import javax.swing.*;

public class GridCrisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public GridCrisis() {
        super("GridCrisis");
        setLookAndFeel();
        setSize(348, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(2,3);//even though this isn't used, this is how you make a GridLayout object; 1st parameter = # rows; 2nd parameter = # columns. 
        setLayout(grid);
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