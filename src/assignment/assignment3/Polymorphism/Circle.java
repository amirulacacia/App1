package assignment.assignment3.polymorphism;

public class Circle extends Shape {
    double PI = 3.142;

    public double area(double radius){
        return PI * Math.pow(radius, 2);
    }
}
