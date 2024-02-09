package quiz.quiz2.question11;

import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2000-01-01");
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period));
    }
}
/*
 * The minimum supported LocalDate is: {-999999999-01-01} and maximum supported
 * LocalDate is: {+999999999-12-31}.
 * 
 * If period of -3000 years is added to 1st Jan 2000, then result is 1st Jan
 * -1000.
 */
