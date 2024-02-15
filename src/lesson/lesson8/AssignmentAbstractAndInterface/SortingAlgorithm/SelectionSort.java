package lesson.lesson8.AssignmentAbstractAndInterface.SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort implements Sortable {

    @Override
    public void sort(int[] array) {
        long start = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
        long end = System.nanoTime();
        double time = (double) (end - start) / 1_000_000.0;

        System.out.println(Arrays.toString(array));
        System.out.println("Elapsed Time: " + time + " millisecond");
    }
}
