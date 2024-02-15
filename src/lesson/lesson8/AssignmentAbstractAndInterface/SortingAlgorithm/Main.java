package lesson.lesson8.AssignmentAbstractAndInterface.SortingAlgorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 10, 2, 2, 5, 1, 4, 3, 9, 6, 20, 30, 4, 43, 24, 23, 32, 65 };

        System.out.println(Arrays.toString(array));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);

    }
}
