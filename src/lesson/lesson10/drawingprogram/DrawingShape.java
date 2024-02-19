package lesson.lesson10.drawingprogram;

import java.awt.Point;
import java.awt.Shape;

public abstract class DrawingShape {
    
    protected Point startPoint;
    protected Point endPoint;

    public DrawingShape(){
        this.startPoint = new Point();
        this.endPoint = new Point();
    }

    public abstract Shape draw();

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}
