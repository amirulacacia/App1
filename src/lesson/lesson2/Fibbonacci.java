package lesson.lesson2;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int f = scanner.nextInt();
        scanner.close();

        System.out.println(fibbonacci(f));
    }

    public static int fibbonacci(int n){
        int F0 = 0;
        int F1 = 1;
        int F = F1 + F0;

        for(int i = 0; i<n ;i++){
            //F = F0 + F1;
            System.out.print(F0 + " ");
            F = F1 + F0;
            F0 = F1;
            F1 = F;
        }

        return F0;
    }
}
