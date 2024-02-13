package quiz.quiz2.question32;

public class Test {
    private static void add(double d1, double d2) { // double is a primitive type
        System.out.println("double version: " + (d1 + d2));
    }

    @SuppressWarnings("unused")
    private static void add(Double d1, Double d2) { // Double is a class
        System.out.println("Double version: " + (d1 + d2));
    }

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        add(10.0, new Integer(10));
    }
}

/*
 * int can be converted to double but Integer type can't be converted to Double
 * type as Integer and Double are siblings (both extends from Number class) so
 * can't be casted to each other.
 * 
 * add(10.0, new Integer(10)); => 1st parameter is tagged to double primitive
 * type and 2nd parameter is converted to int, is tagged to double primitive
 * type as well. So, add(double, double); method is invoked.
 */
