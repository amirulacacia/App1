package assignment.assignment2;

import java.util.Scanner;

public class PowerMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int dim = scanner.nextInt();
        double[][] a = new double[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        double[][] b = new double[dim][dim];
        double[][] c = new double[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                b[i][j] = a[i][j];
            }
        }

        // The calculation will looping according to exponent
        // Start with 1 due to number of time the matrix will be multiply.
        // Example: exponent 2, the matrix will be multiply 1 times.
        for (int p = 1; p < n; p++) {       

            //Multiplication of matrix
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    c[i][j] = 0;

                    for (int k = 0; k < dim; k++) {
                        c[i][j] += b[i][k] * a[k][j];
                    }
                }
            }
            
            //The result of multiplication will be save to b 
            //as temporary result for the next multiplication
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    b[i][j] = c[i][j];
                }
            }
        }

        for (int i = 0; i < dim; i++) {
            System.out.println("");
            for (int j = 0; j < dim; j++) {
                System.out.printf("%.1f   ", c[i][j]);
            }
        }
    }
}
