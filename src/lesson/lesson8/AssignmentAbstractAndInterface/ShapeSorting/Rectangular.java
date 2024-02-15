package lesson.lesson8.AssignmentAbstractAndInterface.ShapeSorting;

public class Rectangular implements SortableShape{
    private double length, width;

    public Rectangular(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }
    
}
