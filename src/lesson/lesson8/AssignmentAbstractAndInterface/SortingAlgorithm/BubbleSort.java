package lesson.lesson8.assignmentabstractandinterface.sortingalgorithm;

import java.util.Arrays;

public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] array) {
        long start = System.nanoTime();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array.length - 1; j > 0 + (array.length - 1 - i); j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        long end = System.nanoTime();
        double time = (double) (end - start) / 1_000_000.0;

        System.out.println(Arrays.toString(array));
        System.out.println("Elapsed Time: " + time + " millisecond");
    }

}
