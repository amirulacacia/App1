package lesson.lesson8.assignmentabstractandinterface.shapesorting;

public class Main {
    public static void main(String[] args) {
        Rectangular rectangular1 = new Rectangular(10, 2);
        Rectangular rectangular2 = new Rectangular(5, 5);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(10, 2);

        SortableShape[] shapes = { rectangular1, rectangular2, circle, triangle };

        System.out.println("Shapes before sorting:");
        for(SortableShape shape:shapes){
            System.out.println("Area: " + shape.area());
        }

        ShapeSorter.sort(shapes);

        System.out.println("\nShapes after sorting:");
        for(SortableShape shape:shapes){
            System.out.println("Area: " + shape.area());
        }
    }
}
