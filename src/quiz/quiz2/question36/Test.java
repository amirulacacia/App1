package quiz.quiz2.question36;

import java.time.Period;

public class Test {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Period period = Period.of(2, 1, 0) // P2Y1M
                .ofYears(10) // P10Y
                .ofMonths(5) // P5M
                .ofDays(2); // P2D
        // So basically the period will replace the old period data. To add the period
        // you need to use add function.
        System.out.println(period);
    }
}

/*
 * of and ofXXX methods are static methods and not instance methods.
 * 
 * Period.of(2, 1, 0) => returns an instance of Period type.
 * 
 * static methods can be invoked using class_name or using reference variable.
 * In this case ofYears(10) is invoked on period instance but compiler uses
 * Period's instance to resolve the type, which is period. A new Period instance
 * {P10Y} is created, after that another Period instance {P5M} is created and
 * finally Period instance {P2D} is created.
 * 
 * This instance is assigned to period reference variable and hence P2D is
 * printed on to the console.
 */
