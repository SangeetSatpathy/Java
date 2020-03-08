//NOTE: if a class you make isn't making any components like buttons or fields, then you don't need to specify a constructor. 

/*Java's Abstract Windowing Toolkit and its swing package(a collection of java classes that represents all buttons, text fields, sliders, and other components that can be part of a GUI as well as the classes needed to take in user input from these components. You have to say "import javax.swing.* ") is the foundation of of the development 
*/
//A JPanel is the simplest kind of container - it is inside other components - its sole job is to divide a container into smaller containers. it doesn't need a title, a setVisible, or a look and feel. You make a class extend JPanel to make it a panel and call the class in a window or a frame. You can also just make a JPanel object itself instead of making a class that is a child of JPanel.

/*Java's user interface classes include: buttons, check boxes, labels, text fields, sliders, pull down menus, pop-up menus, windows, frames, dialog boxes, panels, and applet windows.*/
class Main {
  public static void main(String[] args) {
      ComboBox_TxtArea sal= new ComboBox_TxtArea();
  }
}