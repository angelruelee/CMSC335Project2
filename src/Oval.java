///2D Shape class for Circle

import java.awt.*;
import java.awt.Graphics;

public class Oval extends Shape {
    ////default constructor with 3 parameters
   public Oval(Rectangle rectangle) {
       super(rectangle);
    }
    ////overridden method draw, puts oval on Graphics object passed as parameter
   @Override
   public void draw(Graphics g) {
           g.fillOval(10, 10, (int)getWidth(), (int)getWidth());
    }
}////end of Oval

