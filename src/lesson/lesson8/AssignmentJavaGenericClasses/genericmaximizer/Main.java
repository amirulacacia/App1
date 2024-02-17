package lesson.lesson8.assignmentjavagenericclasses.genericmaximizer;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 1, 9, 4};
        Maximizer<Integer> intMaximizer = new Maximizer<>(intArray);
        int maxInt = intMaximizer.max(Comparator.naturalOrder());
        System.out.println("Maximum integer: " + maxInt);

        String[] strArray = {"apple", "banana", "orange", "pineapple"};
        Maximizer<String> strMaximizer = new Maximizer<>(strArray);
        String maxStr = strMaximizer.max(Comparator.naturalOrder());
        System.out.println("Maximum string: " + maxStr);

        Boolean[] boolArray = {true, false, false, false};
        Maximizer<Boolean> boolMaximizer = new Maximizer<>(boolArray);
        boolean maxBool = boolMaximizer.max(Comparator.reverseOrder());
        System.out.println("Maximum boolean: " + maxBool);
    }
}
