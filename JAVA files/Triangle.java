///2D Shape class for Triangle

import java.awt.*;
import java.awt.Graphics;

public class Triangle extends Shape {
    ////default constructor with 3 parameters
    public Triangle(Rectangle rectangle) {
       super(rectangle);
    }
    ////overridden method draw, puts oval on Graphics object passed as parameter
   @Override
   public void draw(Graphics g) {  
       Polygon triangle = new Polygon();
        triangle.addPoint(-(int)getWidth()/2 + 125, 243);
        triangle.addPoint(125, -(int)getHeight() + 243);
        triangle.addPoint((int)getWidth()/2 + 125, 243);
        g.fillPolygon(triangle);

    }
}////end of Triangle

