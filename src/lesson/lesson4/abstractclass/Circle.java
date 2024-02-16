package lesson.lesson4.abstractclass;

public class Circle extends Shape{

    private double radius;
    private double PI = 3.14159;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }
}
