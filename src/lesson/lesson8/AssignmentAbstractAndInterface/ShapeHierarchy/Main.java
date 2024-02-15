package lesson.lesson8.AssignmentAbstractAndInterface.ShapeHierarchy;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5, 4);
        System.out.println("Rectangle:");
        System.out.printf("Area: %.2f, Perimeter: %.2f, %s",
                rectangle.getArea(), rectangle.getPerimeter(), rectangle.toString());
        
        Circle circle = new Circle(5);
        System.out.println("\n\nCircle:");
        System.out.printf("Area: %.2f, Perimeter: %.2f, %s",
                circle.getArea(), circle.getPerimeter(), circle.toString());

        Square square = new Square(10);
        System.out.println("\n\nSquare:");
        System.out.printf("Area: %.2f, Perimeter: %.2f, %s",
                square.getArea(), square.getPerimeter(), square.toString());
    }
}
