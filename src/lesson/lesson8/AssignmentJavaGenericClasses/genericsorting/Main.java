package lesson.lesson8.assignmentjavagenericclasses.genericsorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericSorting<Integer> quicksort = new GenericSorting<>();
        Integer[] array = {4, 2, 7, 1, 9, 3, 10, 3, 5, 7, 8, 6};

        System.out.println("Original array: " + Arrays.toString(array));
        quicksort.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
