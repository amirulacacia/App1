package lesson.lesson10.drawingprogram;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends DrawingShape {

    @Override
    public Shape draw() {
        double radius = Math.sqrt(
                Math.pow(endPoint.getX() - startPoint.getX(), 2) +
                        Math.pow(endPoint.getY() - startPoint.getY(), 2));
        return new Ellipse2D.Double(
                startPoint.getX() - radius,
                startPoint.getY() - radius,
                2 * radius,
                2 * radius);
    }
}
