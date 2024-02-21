package quiz.quiz3.question54;

import java.sql.SQLException;

public class Test {
    private static void getReport() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw null;
        }
    }

    public static void main(String[] args) {
        try {
            getReport();
        } catch (SQLException e) {
            System.out.println("REPORT ERROR");
        }
    }
}

/*
 * Classes in Exception framework are normal java classes, hence null can be
 * used wherever instances of Exception classes are used, so Line 10 compiles
 * successfully.
 * 
 * No issues with Line 16 as method getReport() declares to throw SQLException
 * and main(String []) method code correctly handles it.
 * 
 * Program compiles successfully but on execution, NullPointerException is
 * thrown, stack trace is printed on to the console and program ends abruptly.
 * 
 * If you debug the code, you would find that internal routine for throwing null
 * exception causes NullPointerException.
 */
