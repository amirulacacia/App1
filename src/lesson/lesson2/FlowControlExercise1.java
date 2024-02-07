package lesson.lesson2;

import java.util.Scanner;

public class FlowControlExercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();
        scanner.close();

        if (x != y) {
            System.out.println("Condition 1 triggered");
        }
        if (x > y) {
            System.out.println("Condition 2 triggered");
        }
        if (x % y == 0) {
            System.out.println("Condition 3 triggered");
        }

    }
}
