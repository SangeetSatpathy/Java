import javax.swing.*;
import java.awt.*;
class CheckBox extends JFrame{
    public CheckBox(){
        super("CheckBox");
        JCheckBox jumboSize = new JCheckBox("Jumbo Size", true);//JCheckBox constructor 1st parameter = the text displayed on the side of the check box. 2nd parameter(optional)= whether the box will be originally checked or not.
        JCheckBox froglegs = new JCheckBox("Frog Leg Grande", true);
        JCheckBox fishtacos= new JCheckBox("Fish Taco Platter", false);
        JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
        FlowLayout flo = new FlowLayout();
        ButtonGroup meals = new ButtonGroup(); //button group groups the JCheckBoxes(and other components like JButtons) into groups, making it so that only one box can be checked at a time.
        meals.add(froglegs);//adds a checkbox to the ButtonGroup
        meals.add(fishtacos);
        meals.add(emuNuggets);
        meals.add(jumboSize);
        setLayout(flo); // you still have to set the layout manager and add the INDIVIDUAL components to it- you CAN'T JUST ADD THE BUTTONGROUP AS A WHOLE.
        add(jumboSize);
        add(froglegs);
        add(fishtacos);
        add(emuNuggets);
        setVisible(true);
        setSize(225,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
    }
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
        }
    }
}