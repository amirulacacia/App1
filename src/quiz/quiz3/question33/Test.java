package quiz.quiz3.question33;

public class Test {
    private static void div(int i, int j){
        try {
            System.out.println(i/j);
        } catch (Exception e) {
            throw (RuntimeException)e;
        }
    }

    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("AE");
        } catch (RuntimeException e) {
            System.out.println("RE");
        }
    }
}
