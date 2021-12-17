//Main class with main method, uses JFrame for GUI

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main { ///main class

////Define GUI buttons
    static JFrame frame;
    static DrawingPanel panel;   

////J variables for the labels and textfields for GUI
     static JTextField twidth, theight;
     static JComboBox<String> cshape;
   ////buttons to provide options
     static JButton draw;
////J variables for the shape, fill, color, and dimensions of the shapes
     static JLabel instructions, instructionsTwo, instructionsThree,
                            instructionsFour, shape, width, height;
     static int shapeWidth, shapeHeight;
     
  public static void main (String[] args) {

      panel = new DrawingPanel(); // anonymous object of DrawingPanel class 
       frame = new JFrame("Shape Drawings");
       frame.setSize(550,350);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.add(panel);
       frame.setVisible(true);
       Main.panel.setBorder(BorderFactory.createTitledBorder("Shape Drawing"));
       Main.panel.setBounds(250, 10, 250, 250);
       Main.panel.setVisible(true);
////invoke JLabel and Textfields
       instructions=new JLabel("Instructions:  Select shape from list");
       instructionsTwo=new JLabel("and input Width or Base, and Height");
       instructionsThree=new JLabel("if needed (Circle, Square, Sphere,");
       instructionsFour=new JLabel("and Cube does not need Height)");
       shape=new JLabel("Shape Type");
       width=new JLabel("Width/Base");
       height=new JLabel("Height");
       cshape=new JComboBox<>(new String[] {"Circle","Square","Triangle",
           "Rectangle","Sphere","Cube","Cone","Cylinder","Torus"});
       
////invoke option to ask for dimensions
       twidth=new JTextField();
       theight=new JTextField();
///////populate frame
       Main.panel.setBorder(BorderFactory.createTitledBorder("Shape DrawingPanel"));
       Main.panel.setBounds(250, 10, 250, 250);
       frame.add(instructions);
       frame.add(instructionsTwo);
       frame.add(instructionsThree);
       frame.add(instructionsFour);
       frame.add(shape);
       frame.add(width);
       frame.add(height);
       frame.add(cshape);
       frame.add(twidth);
       frame.add(theight);
       frame.add(draw);
///////setBounds to coordinate position for all the J variables
       instructions.setBounds(10, 15, 225, 25);
       instructionsTwo.setBounds(10, 35, 225, 25);
       instructionsThree.setBounds(10, 55, 225, 25);
       instructionsFour.setBounds(10, 75, 225, 25);
       shape.setBounds(10, 125, 100, 25);
       width.setBounds(10, 165, 100, 25);
       height.setBounds(10, 200, 100, 25);
       Main.cshape.setBounds(110, 125, 100, 25);
       twidth.setBounds(110, 165, 100, 25);
       Main.theight.setBounds(110, 200, 100, 25);
       draw.setBounds(200, 275, 80, 25);
   }//end main method
}