package lesson.lesson10.drawingprogram;

import java.awt.Shape;
import java.awt.geom.Line2D;

public class Line extends DrawingShape{

    @Override
    public Shape draw() {
        return new Line2D.Double(startPoint, endPoint); // Return the shape of line
    }
    
}
