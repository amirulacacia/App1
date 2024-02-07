package quiz.quiz1.question4;

public class Test {
    private static void div() {
        System.out.println(1 / 0);
    }

    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }
}

/*****************************************************
 * The results of compilling will FINALLY is printed to the console,
 * stack trace is printed and then program ends abruptly.
 * This is due to the division of 1 with 0 which will
 * give infinite value.
 ******************************************************/