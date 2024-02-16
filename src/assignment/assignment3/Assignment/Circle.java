package assignment.assignment3.assignment;

public class Circle extends Shape {

    double PI = 3.142;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(this.radius, 2);
    }

}
