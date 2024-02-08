package assignment.assignment2;

import java.util.Arrays;

public class SequentialSearch {

    public static void main(String[] args) {
        int length = 10;
        int[] a = new int[length];
        int k = 5;

        a = generateNumber(a, length);
        System.out.println(Arrays.toString(a));

        searchNumber(k, a, length);

    }

    public static void searchNumber(int k, int[] a, int length) {
        int i = 0;

        while (i < length && k != a[i]) {
            i++;
        }

        if (i >= length)
            i = -1;

        System.out.printf("k is at %d, if i is not -1", i);
    }

    public static int[] generateNumber(int[] num, int length) {
        double randomNum;

        for (int i = 0; i < length; i++) {

            randomNum = Math.random() * 11;
            num[i] = (int) randomNum;
        }

        return num;
    }
}
