package lesson.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    static List<Integer> ary = Arrays.asList(1, 2, 3, 4);
    static List<Integer> ary_filtered = new ArrayList<>();

    static void filter() {
        ary.forEach((a) -> 
            {
                if (a.equals(1)) {
                    ary_filtered.add(a);
                }
            }
        );
    }

    public static void main(String[] args) {
        System.out.println("List of items: ");
        ary.forEach((a) -> System.out.print(a));

        System.out.println("\nFiltered list of items: ");
        filter();
        ary_filtered.forEach((a) -> System.out.print(a));
    }
}
