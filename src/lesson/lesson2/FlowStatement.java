package lesson.lesson2;

import java.util.Scanner;

public class FlowStatement {
    public static void main(String[] args) {
        int a, b, c;
        int m;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        c = scanner.nextInt();
        scanner.close();

        m = conditionCheck(a, b, c);
        System.out.println("The maximum number: " + m);
    }

    public static int conditionCheck(int x, int y, int z) {
        int max;

        max = x <= y ? y : x;
        max = max <= z ? z : null;

        return max;
    }
}
