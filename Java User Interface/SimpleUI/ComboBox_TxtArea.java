import javax.swing.*;
import java.awt.*;
class ComboBox_TxtArea extends JFrame{
    public ComboBox_TxtArea(){
        super("ComboBox_TxtArea");
        setSize(225,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JTextArea comments = new JTextArea("hi",8,40);//a text box, more than one line; 1st parameter = text to be displayed inside box (optional); 2nd parameter = how many lines for height; 3rd parameter= how many characters as length for box (you can still write downwards)
        JComboBox profession = new JComboBox(); //how to call a JComboBox method, no parameters
        FlowLayout flo = new FlowLayout();//FlowLayout
        profession.addItem("Teacher"); //this addItem() method of JComboBox adds a dropdown item as one of the option - the parameter is the text displayed.
        profession.addItem("Soldier");
        profession.addItem("Doctor");
        profession.addItem("Engineer");
        profession.addItem("Scientist");
        profession.addItem("Chef");
        profession.addItem("Farmer");
        profession.setEditable(true);// allows the items in the ComboBox to be editable. This statement must come before the combo box is added.
        setLayout(flo); //you still need to set the FlowLayout
        add(profession); // you add the whole ComboBox with all its items to the FlowLayout
        add(comments);//adds the JTextArea.
        setVisible(true);
    }
        private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
        }
    }
}