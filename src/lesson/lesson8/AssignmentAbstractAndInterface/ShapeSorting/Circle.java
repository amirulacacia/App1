package lesson.lesson8.assignmentabstractandinterface.ShapeSorting;

public class Circle implements SortableShape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
