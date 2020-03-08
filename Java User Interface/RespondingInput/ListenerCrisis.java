//NOTE: if a class you make isn't making any components like buttons or fields, then you don't need to specify a constructor. 

import java.awt.*;//for gui
import java.awt.event.*;//for EventListeners, they are under java.awt.event.* package.
import javax.swing.*;//for gui

//to respond to the use of a choice-list(combo-box) or a checkbox, you have to use ItemListener
//For mouse clicks and releases, use MouseListener - but for mouse movement, use MouseMotionListener.
//For the majority of actions, the ActionListener interface is to be used. ActionListener is the interface that deals with all the actions involving components.
//To respond to a key press, release, or when a character is typed, use the KeyListener interface.
//For JSliders, use ChangeListener interface.

//when an action is performed, each of the listeners automatically calls a different method to receive what happens in the events. For the ActionListener interface, it send events to a method called actionPerformed(). You will be creating the methods in the applet(even if it doesn't do anything), overriding the Listener interface methods, which are too abtract. NOTE: these methods are AUTOMATICALLY called - you dont need to call it or input the event that occurred - you just need to define what happens.


/*ItemListener:
The events are received by itemStateChange(ItemEvent) method, which must be overrided.
To get the object that caused the event, use the ItemEvent object's getItem() method.
Using the ItemEvent's getStateChange() method, it returns the type or state change(selected or deselected - ItemEvent.SELECTED or ItemEvent.DESELECTED) */


/*KeyListener:
The methods that receive events about the keys (KeyEvent) are: void keyPressed(KeyEvent), void keyReleased(KeyEvent), void keyTyped(KeyEvent), which all have to be overrided and coded, even if it doesn't need to do anything
NOTE: keyTyped(KeyEvent) is when a key has been both pressed an released.
To monitor which key caused an event(including Home, F1, Up, etc), you can use KeyEvent's getKeyCode() method which returns an integer value representing the key. Then, you use KeyEvent's getKeyText(int code) method with the code as its parameter, and it will return a String with the name of the key.
You could also use KeyEvent's getKeyChar() method which returns a char for the letter keys ONLY.*/

/*MouseListener:
events sent to mouseClicked(), mouseEntered() - mouse entered a component, mouseExited()- mouse exited a component, mousePressed(),and mouseReleased(), all of which take in a MouseEvent object as input --> all need to be overrided.

MouseMotionListener:
events are sent to mouseDragged(),where mouse is clicked AND moved, and mouseMoved(), both of which take in a MouseEvent object as parameter; both need to be overrided.*/

/*ChangeListener:
events sent to stateChanged(ChangeEvent) method, needs to be overrided
to get the source, get the ChangeEvent's getSource() method, casting the output into a JSlider*/
public class ListenerCrisis extends JFrame implements ActionListener{
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public ListenerCrisis() {
        super("ListenerCrisis");
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
        panicButton.addActionListener(this);//adds an ActionListener to the panic button, with its argument reffering to the object that receives the user event and handles it, which is in this case, the current object(this).
        dontPanicButton.addActionListener(this);
        blameButton.addActionListener(this);
        mediaButton.addActionListener(this);
        saveButton.addActionListener(this);
        add(panicButton);
        add(dontPanicButton);
        add(blameButton);
        add(mediaButton);
        add(saveButton);
        setVisible(true);
    }
    
    //ActionEvent has a method to know which component the action comes from. It is ActionEvent's getSource() method which sends back the object that caused the event.
    //the actionPerformed method which takes in the event as an argument; method invoked when action occurs. The event is an object of the data type of ActionEvent.
    public void actionPerformed(ActionEvent event){
            //what to do with the event
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


//the class that responds to the input is often separated from the class that has all the components, but interconnected with each other by creating object instances of each other to do something, together creating an interactive user interface. The class responding to input has no constructor but has many methods, while the component class creates an object of the input-responding class, making it able to call all the methods.