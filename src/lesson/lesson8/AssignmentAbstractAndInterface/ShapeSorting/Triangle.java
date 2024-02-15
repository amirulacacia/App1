package lesson.lesson8.AssignmentAbstractAndInterface.ShapeSorting;

public class Triangle implements SortableShape{
    private double length, width;

    public Triangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        return this.length * this.width / 2;
    }
}
