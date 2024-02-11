package assignment.assignment3.Assignment;

public class Main {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(10.5, 5.2);
        Shape circle = new Circle(1.2);

        System.out.println("Area of Rectangular: " + rectangular.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
