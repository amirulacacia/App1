package lesson.lesson2;

import java.util.Scanner;

public class FlowControlExercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the (true/false) for p: ");
        boolean p = scanner.nextBoolean();
        System.out.print("Enter the (true/false) for q: ");
        boolean q = scanner.nextBoolean();
        scanner.close();

        if (p && q) {
            q = false;
        } else {
            if (!q) {
                System.out.println("Answer: " + p);
            }
            if (p == q) {
                System.out.println("Answer: " + (p || q));
            }
        }
        System.out.println("Answer: " + q);
    }
}
