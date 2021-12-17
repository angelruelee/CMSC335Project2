///3D Shape class for Cylinder

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

////subclass Cylinder
public class Cylinder extends Shape {
    ////default constructor with 3 parameters
    public Cylinder(Rectangle rectangle) throws IOException {
    super(rectangle);
    BufferedImage picFromFile = ImageIO.read(this.getClass().getResourceAsStream("images/Cylinder.jpg"));
    Image scaleImage = picFromFile.getScaledInstance(Main.shapeWidth*95/100, Main.shapeHeight*95/100,Image.SCALE_DEFAULT);
    JLabel picture = new JLabel(new ImageIcon(scaleImage));
    Main.panel.add(picture);
    }
    ////overridden method draw, puts empty shape on Graphics object passed as parameter
   @Override
   public void draw(Graphics g) {
        g.fillRect(75, 75, 0, 0);
    }
}////end of Cylinder