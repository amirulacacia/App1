package quiz.quiz3.question23;

public class Test {
    public static void main(String[] args) {
        System.out.println(new RuntimeException());
        System.out.println(new RuntimeException("HELLO"));
        System.out.println(new RuntimeException(new RuntimeException("HELLO")));
    }
}
