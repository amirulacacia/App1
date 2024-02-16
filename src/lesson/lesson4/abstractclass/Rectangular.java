package lesson.lesson4.abstractclass;

public class Rectangular extends Shape {
    private double width;
    private double length;

    public Rectangular(double length, double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return this.width * this.length;
    }
}
