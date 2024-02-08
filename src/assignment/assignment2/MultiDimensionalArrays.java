package assignment.assignment2;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][][] a = { { { 1, 2, 3 }, { 4, 5 }, { 6 } }, { { 7, 8 }, { 9 } } };
        System.out.print("a.length = " + a.length);

        for (int i = 0; i < a.length; i++) {
            showArrayLength(a, i);
            for (int j = 0; j < a[i].length; j++) {
                showArrayLength(a, i, j);
                for (int k = 0; k < a[i][j].length; k++) {
                    showArrayValue(a, i, j,k);
                }
            }
        }
    }

    public static void showArrayLength(int[][][] a, int i){
        System.out.printf("\na[%d].length = %d", i, a[i].length);
    }

    public static void showArrayLength(int[][][] a, int i, int j){
        System.out.printf("\na[%d][%d].length = %d\n", i, j, a[i][j].length);
    }

    public static void showArrayValue(int[][][] a, int i, int j, int k){
        System.out.printf("a[%d][%d][%d] = %d, ", i, j, k, a[i][j][k]);
    }
}
