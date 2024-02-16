package lesson.lesson4.abstractclass;

public class Main {
    public static void main(String[] args) {
        // Abstract class is a template for subclass
        Shape rectangular = new Rectangular(5,4);
        Circle circle = new Circle(3);

        System.out.println(rectangular.calculateArea());
        System.out.println(circle.calculateArea());
    }
}

// An abstract class in Java cannot be instantiated. It's meant to be extended by subclasses,
// which provide implementations for the abstract methods defined in the abstract class.
// Abstract classes are appropriate when you have a class that serves as a template for other
// classes and provides common behavior or structure that subclasses can inherit and extend.
