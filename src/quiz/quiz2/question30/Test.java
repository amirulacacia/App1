package quiz.quiz2.question30;

public class Test {
    public static void main(String[] args) {
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int) d;
        f = (long) d;
    }
}

/*
 * For readability purpose underscore (_) is used to separate numeric values.
 * This is very useful in representing big numbers such as credit card numbers
 * (1234_7654_9876_0987). long data can be suffixed by l, float by f and double
 * by d. So first 5 variable declaration and assignment statements inside
 * main(String []) method don't cause any compilation error.
 * 
 * Let's check rest of the statements:
 * 
 * l = c + i; => Left side variable 'l' is of long type and right side
 * expression evaluates to an int value, which can easily be assigned to long
 * type. No compilation error here.
 * 
 * f = c * l * i * f; => Left side variable 'f' is of float type and right side
 * expression evaluates to float value, which can easily be assigned to float
 * type. Hence, it compiles successfully.
 * 
 * f = l + i + c; => Left side variable 'f' is of float type and right side
 * expression evaluates to long value, which can easily be assigned to float
 * type. Hence, no issues here.
 * 
 * i = (int)d; => double can't be assigned to int without explicit casting,
 * right side expression `(int)d;` is casting double to int, so no issues.
 * 
 * f = (long)d; => double can't be assigned to float without explicit casting,
 * right side expression `(long)d;` is casting double to long, which can easily
 * be assigned to float type. It compiles successfully.
 */
