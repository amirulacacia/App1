package lesson.lesson2;

import java.util.Scanner;

//   0 +   1 +   2 +   3 ....  48 +  49       50
// 100 +  99 +  98 +  97 ....  52 +  51
// 100 + 100 + 100 + 100 .... 100 + 100       100*50+50 = 50(100 + 1)   :   n/2(n+1)

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        System.out.println("Algorithm Calculation: " + algorithm(limit));
        System.out.println("Loop Calculation: " + loop(limit));

    }

    public static int algorithm(int n){
        int total;

        total = n/2*(n+1);
        return total;
    }

    public static int loop(int n) {

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return total;
    }
}
