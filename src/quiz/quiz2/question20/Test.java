package quiz.quiz2.question20;

public class Test {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String str = process(arr, 3, 8);
        System.out.println(str);
    }
    // Wrong
    // private static String [ ] process ( int [ ] arr, int start, int end ) {
    // return null; }

    // Wrong
    // private static int process ( int [ ] arr, int start, int end ) { return null;
    // }

    // Correct
    private static String process(int[] arr, int start, int end) {
        return null;
    }

    // Wrong
    // private static int[ ] process ( int [ ] arr, int start, int end ) { return
    // null; }
}

/*
 * It is clear from Line 5 that, method name should be process, it should be
 * static method, it should accept 3 parameters (int[], int, int) and its return
 * type must be String.
 */