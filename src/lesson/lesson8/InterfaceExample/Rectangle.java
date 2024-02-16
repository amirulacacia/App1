package lesson.lesson8.interfaceexample;

public class Rectangle extends Border implements Shape, Fill {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public boolean fillable() {
        return false;
    }

}
