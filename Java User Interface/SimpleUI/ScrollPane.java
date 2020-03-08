import java.awt.*;
import javax.swing.*;
//JScrollPane is a scroller that allows you to go beyond the boundaries of the containers, both horizontally and vertically. MOSTLY USED W/ PANELS.
/*Constructors:
JScrollPane()- a scrollbar both horizontally and vertically as needed
JScrollPane(int vertical, int horizontal) - scrollbars vertically and horizontally as specified
JScrollPane(Component c)- A scrollbar that goes around a specific component that is specified.
JScrollPane(Component c, int vertical, int horizontal)

For these contructors, the integers are constant of the following, each of which are self-explanatory:
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED or JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
    JScrollPane.VERTICAL_SCROLLBAR_NEVER or JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS or JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
    */
//If not specified which components the scrollbar is in with the Constructor, then you can use JScrollPane's add(Component) method.
public class ScrollPane extends JFrame {

    public ScrollPane() {
        super("Write an E-Mail");
        setLookAndFeel();
        setSize(370, 270);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
        setLayout(flow);
        
        JPanel row1 = new JPanel();
        JLabel toLabel = new JLabel("To:");
        row1.add(toLabel);
        JTextField to = new JTextField(24);
        row1.add(to);
        add(row1);
        
        JPanel row2 = new JPanel();
        JLabel subjectLabel = new JLabel("Subject:");
        row2.add(subjectLabel);
        JTextField subject = new JTextField(24);
        row2.add(subject);
        add(row2);
        
        JPanel row3 = new JPanel();
        JLabel messageLabel = new JLabel("Message:");
        row3.add(messageLabel);
        JTextArea message = new JTextArea(4, 22);
        message.setLineWrap(true);
        message.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(message,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        row3.add(scroll);//then add the scroll to the JPanel
        add(row3);
        
        JPanel row4 = new JPanel();
        JButton send = new JButton("Send");
        row4.add(send);
        add(row4);
        
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