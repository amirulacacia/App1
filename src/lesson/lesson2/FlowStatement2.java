package lesson.lesson2;

import java.util.Scanner;

public class FlowStatement2 {
    public static void main(String[] args) {
        int i = 1, nFact = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        while (i<=n) {
            nFact = nFact*i;
            i=i+1;
        }

        System.out.println("n!= " + nFact);
    }
}
