package lesson.lesson2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorialNumber;

        while (true) {
            System.out.print("Enter factorial number: ");
            factorialNumber = scanner.nextInt();

            if (factorialNumber>=0) {
                break;
            }else
                System.out.println("Please enter value above or equal 0!");;
        }

        scanner.close();
        System.out.println("Answer: " + factorialCalculation(factorialNumber));
    }

    public static int factorialCalculation(int factorialNumber) {
        int total = 1;

        if (factorialNumber != 0) {
            for (int i = 1; i <= factorialNumber; i++) {
                total*=i;
            }
        } else
            total = 1;

        return total;
    }
}
