package assignment.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        double[] numbers = { 5.5, 2.0, 2.5, 1.2, 5.6, 3.0, 2.5, 0.5 };
        boolean sortWay;

        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(numbers));
        System.out.println("How do you want to sort this number? ");
        System.out.print("( true : increasing  /  false : decreasing ) : ");
        sortWay = scanner.nextBoolean();
        scanner.close();

        selectionSort(numbers, sortWay);
        System.out.println(Arrays.toString(numbers));
    }

    public static double[] selectionSort(double[] d, boolean sortWay) {
        double temp;
        int index;

        for (int i = 0; i < d.length; i++) {
            index = sortWay ? findMinIdx(d, i) : findMaxIdx(d, i);
            temp = d[i];
            d[i] = d[index];
            d[index] = temp;
        }
        return d;
    }

    public static int findMinIdx(double[] d, int k) {
        int minIdx = k;
        for (int i = k; i < d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findMaxIdx(double[] d, int k) {
        int maxIdx = k;
        for (int i = k; i < d.length; i++) {
            if (d[i] > d[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
