package lesson.lesson8.InterfaceExample;

public class Circle extends Border implements Shape, Fill {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() { // This method were implement because of Shape interface
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() { // This method were implement because of Shape interface
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean fillable() { // This method were implement because of Fill interface
        return true;
    }
}
