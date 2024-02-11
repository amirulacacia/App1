package assignment.assignment3.Assignment;

public class Rectangular extends Shape {

    double length, width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

}
