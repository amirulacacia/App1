package lesson.lesson8.AssignmentAbstractAndInterface.ShapeHierarchy;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
