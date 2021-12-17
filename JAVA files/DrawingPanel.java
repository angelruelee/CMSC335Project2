///Drawing Panel class where the shapes will appear and be summoned

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

////class DrawingPanel, extends JFrame
////use GUI JFrame
class DrawingPanel extends JPanel implements ActionListener{
   ////define Shape value starting at null
    Shape s=null;

    DrawingPanel() {
           ////invoke button option
           Main.draw=new JButton("Draw");
           Main.draw.setPreferredSize(new java.awt.Dimension());
    //// actionListener for Draw button
          Main.draw.addActionListener(this);
    }// End class

////overridden method paintComponent
@Override
public void paintComponent(Graphics g) {

    try {
        super.paintComponent(g);
        s.setColor(g);
        s.draw(g);
    }catch(Exception e) {
    }
}

////overridden method getPreferredSize
@Override
public Dimension getPreferredSize() {
    return new Dimension(200, 200);
}

////drawShape method for 2D shapes to make sure dimensions arent beyond 200x200
public void drawShape() throws OutsideBounds {
    if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("circle")
        || ((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("sphere")
        || ((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("square")
        || ((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("cube")){
        try {
            Main.shapeWidth=Integer.parseInt(Main.twidth.getText());
            if((Main.shapeWidth)>235 || (Main.shapeHeight)>235 || Main.shapeWidth<0)
                throw new OutsideBounds("This shape exceeds the 200x200 panel!");
        }catch(OutsideBounds o) {
            JOptionPane.showMessageDialog(null, o.getMessage());
        }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input cannot be blank or non-numbers!");
        }//end of try
   }//if circle or sphere or square or cube
    else{
        try {
            Main.shapeWidth=Integer.parseInt(Main.twidth.getText());
            Main.shapeHeight=Integer.parseInt(Main.theight.getText());
            if((Main.shapeWidth)>235 || (Main.shapeHeight)>235 || Main.shapeWidth<0 || Main.shapeHeight<0)
                throw new OutsideBounds("This shape exceeds the 200x200 panel!");
        }catch(OutsideBounds o) {
            JOptionPane.showMessageDialog(null, o.getMessage());
        }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Height cannot be blank or non-numbers!");
        }//end of try    
    }

} // end drawShape


@Override
public void actionPerformed(ActionEvent arg0) {
       try {
           drawShape(); //summon drawShape method
           Rectangle rectangle = new Rectangle(0, 0, Main.shapeWidth, Main.shapeHeight);
           Dimension dimension = new Dimension(Main.shapeWidth, Main.shapeHeight);

           if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("circle")){
               Main.panel.removeAll();
               Main.theight.setText("");
               s=new Oval(rectangle);
               Main.panel.repaint();
               Main.panel.validate();  
           }
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("square")){
               Main.panel.removeAll();
               Main.theight.setText("");
               s=new Square(rectangle);
               Main.panel.repaint();
               Main.panel.validate();  
           }
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("triangle")){
               Main.panel.removeAll();
               s=new Triangle(rectangle);
               Main.panel.repaint();
               Main.panel.validate();  
           }
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("rectangle")){
               Main.panel.removeAll();
               s=new Rectangular(rectangle);
               Main.panel.repaint();
               Main.panel.validate();   
           }
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("sphere")){
                Main.panel.removeAll();
                Main.theight.setText("");
                s=new Sphere(rectangle);
                Main.panel.repaint();
                Main.panel.validate(); 
           }
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("cube")){
                Main.panel.removeAll();
                Main.theight.setText("");
                s=new Cube(rectangle);
                Main.panel.repaint();
                Main.panel.validate(); 
           }
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("cone")){
                Main.panel.removeAll();
               s=new Cone(rectangle);
                Main.panel.repaint();
                Main.panel.validate();   
           }
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("cylinder")){
                Main.panel.removeAll();
               s=new Cylinder(rectangle);
                Main.panel.repaint();
                Main.panel.validate();  
           }           
           else if(((String)Main.cshape.getSelectedItem()).equalsIgnoreCase("torus")){
                Main.panel.removeAll();
               s=new Torus(rectangle);
                Main.panel.repaint();
                Main.panel.validate();  
           } 

            // call paintComponent() method
       }catch(OutsideBounds o) { 
           JOptionPane.showMessageDialog(null, o.getMessage());
}      catch (IOException ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
}

////class OutsideBounds to define a checked exception
class OutsideBounds extends Exception {
   public OutsideBounds(String errorMessage) {
       super(errorMessage);   
}
}

////Returns an ImageIcon for the 3D shapes, or null if the path was invalid.
protected static ImageIcon createImageIcon(String path) {
    java.net.URL imgURL = DrawingPanel.class.getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}  
}// End DrawingPanel class