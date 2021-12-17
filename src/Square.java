///2D Shape class for Square

import java.awt.*;
import java.awt.Graphics;

public class Square extends Shape {
    ////default constructor with 3 parameters
    public Square(Rectangle rectangle) {
       super(rectangle);
    }
    ////overridden method draw, puts rectangle on Graphics object passed as parameter
   @Override
   public void draw(Graphics g) {
        g.fillRect(10, 10, (int)getWidth(), (int)getWidth());
    }
}////end of Square


