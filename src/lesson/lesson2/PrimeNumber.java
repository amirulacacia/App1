package lesson.lesson2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start, end;

        while (true) {
            System.out.print("Enter the start number: ");
            start = scanner.nextInt();
            System.out.print("Enter the end number: ");
            end = scanner.nextInt();
            if (start >= 0 && end >= 0 && start < end) {
                break;
            }
            else if(start > end){
                System.out.println("Please enter end number larger than start number!");
            }
            else {
                System.out.println("Please enter number above or equal 0!");
            }
        }
        scanner.close();

        System.out.print("Prime number: ");
        checkPrime(start, end);
    }

    public static void checkPrime(int start, int end) {
        int num = start - 1;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            } else
                num++;
        }

        if (num == end) {
            System.out.println("There is no prime number!");
        }
    }

    public static boolean isPrime(int num) {
        boolean condition = true;

        switch (num) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                break;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                condition = false;
                break;
            }else
                condition = true;
        }

        return condition;
    }
}
