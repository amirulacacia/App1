package lesson.lesson10.drawingprogram;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Rectangle extends DrawingShape{

    @Override
    public Shape draw() {
        return new Rectangle2D.Double( // Return the shape of rectangle
                Math.min(startPoint.getX(), endPoint.getX()),
                Math.min(startPoint.getY(), endPoint.getY()),
                Math.abs(endPoint.getX() - startPoint.getX()),
                Math.abs(endPoint.getY() - startPoint.getY()));
    }
    
}
