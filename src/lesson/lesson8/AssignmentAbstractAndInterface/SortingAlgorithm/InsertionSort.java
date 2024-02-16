package lesson.lesson8.assignmentabstractandinterface.sortingalgorithm;

import java.util.Arrays;

public class InsertionSort implements Sortable {

    @Override
    public void sort(int[] array) {
        long start = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        long end = System.nanoTime();
        double time = (double) (end - start)  / 1_000_000.0;

        System.out.println(Arrays.toString(array));
        System.out.println("Elapsed Time: " + time + " millisecond");

    }
}
