//Abstract class Shape that all the other shapes classes are based on

import java.awt.*;
import java.awt.Graphics;

////abstract class Shape,  extends the predefined Java class Rectangle below
public abstract class Shape extends Rectangle {


////default constructor
   public Shape(Rectangle rectangle) {
       super(rectangle);
}

////setter method for color
   public void setColor(Graphics g) {
           g.setColor(Color.BLACK);
}

   ////abstract method, accepts Graphics object as parameter
   public abstract void draw(Graphics g);
}//////end of class
