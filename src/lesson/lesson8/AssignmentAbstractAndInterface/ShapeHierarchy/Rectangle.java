package lesson.lesson8.assignmentabstractandinterface.shapehierarchy;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
