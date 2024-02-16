package assignment.assignment3.polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular();
        Circle circle = new Circle();

        System.out.println("Area of Rectangular without input: " + rectangular.area());
        System.out.println("Area of Circle without input: " + circle.area());
        System.out.println("Area of Rectangular: " + rectangular.area(4,2.5));
        System.out.println("Area of Circle: " + circle.area(10));
    }
}
