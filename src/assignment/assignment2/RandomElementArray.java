package assignment.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class RandomElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length of Array: ");
        int length = scanner.nextInt();
        System.out.print("Min Random Number: ");
        int min = scanner.nextInt();
        System.out.print("Max Random Number: ");
        int max = scanner.nextInt();
        scanner.close();

        int[] num = new int[length];
        double randomNum;

        for (int i = 0; i < length; i++) {

            //You can try check using min = 11 and max = 12 to see the difference between this 2 code.
            //This is due to double number being change into integer. Where the double number were not round off to nearest number.
            randomNum = Math.random() * (max - min + 1) + min;  // This give high chance for max number to be trigger due to percentage
            //randomNum = Math.random() * (max - min) + min;    // This give very low chance for max number to be trigger
            //System.out.println(randomNum);
            num[i] = (int) randomNum;
        }

        System.out.println(Arrays.toString(num));

    }
}
