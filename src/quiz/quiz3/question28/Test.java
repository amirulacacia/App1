package quiz.quiz3.question28;

import java.sql.SQLException;

public class Test {
    private static void getData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = new SQLException();
            // throw e;
        }
    }

    public static void main(String[] args) {
        try {
            getData();
        } catch (Exception e) {
            System.out.println("SQL");
        }
    }
}
/*
 * If you don't initialize variable e inside catch block using `e = new
 * SQLException();` and simply throw e, then code would compile successfully as
 * compiler is certain that 'e' would refer to an instance of SQLException only.
 * 
 * But the moment compiler finds `e = new SQLException();`, `throw e;` causes
 * compilation error as at runtime 'e' may refer to any Exception type.
 */
