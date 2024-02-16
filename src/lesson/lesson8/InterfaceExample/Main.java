package lesson.lesson8.interfaceexample;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.4);

        System.out.println("Circle: ");
        System.out.printf("Area: %.2f, Perimeter: %.2f, Border: %d",
                circle.calculateArea(), circle.calculatePerimeter(), circle.border());
        System.out.println(", Fill?: " + circle.fillable());

        Rectangle rectangle = new Rectangle(5, 2.5);

        System.out.println("Rectangle: ");
        System.out.printf("Area: %.2f, Perimeter: %.2f, Border: %d",
                rectangle.calculateArea(), rectangle.calculatePerimeter(), rectangle.border());
        System.out.println(", Fill?: " + rectangle.fillable());
    }
}
