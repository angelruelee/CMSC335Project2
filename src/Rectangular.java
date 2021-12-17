///2D Shape class for Rectangle

import java.awt.*;
import java.awt.Graphics;

public class Rectangular extends Shape {
    ////default constructor with 3 parameters
    public Rectangular(Rectangle rectangle) {
       super(rectangle);
    }
    ////overridden method draw, puts rectangle on Graphics object passed as parameter
   @Override
   public void draw(Graphics g) {
        g.fillRect(10, 10, (int)getWidth(), (int)getHeight());
    }
}////end of Rectangular
