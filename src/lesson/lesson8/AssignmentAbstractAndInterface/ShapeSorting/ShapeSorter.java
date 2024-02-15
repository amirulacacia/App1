package lesson.lesson8.AssignmentAbstractAndInterface.ShapeSorting;

public class ShapeSorter {
    static void sort(SortableShape[] shapes) {
        for (int i = 1; i < shapes.length; i++) {
            double temp = shapes[i].area();

            for (int j = i - 1; j >= 0; j--) {
                if (shapes[j].area() > temp) {
                    SortableShape tempShape = shapes[j + 1];
                    shapes[j + 1] = shapes[j];
                    shapes[j] = tempShape;
                }
            }
        }
    }
}
