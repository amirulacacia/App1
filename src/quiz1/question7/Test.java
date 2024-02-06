package quiz1.question7;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1983-06-30");
        System.out.println(date.plusMonths(8));

    }
}

/*
 * After adding 8 months to the date, we will get February.
 * Due to 1984 is the leap year, therefore the days of the
 * month will be 29.
 * 
 * Leap year only occurs every 4 years. It starts on
 * 0 CE. So, after 4 years, the 4 CE will be the leap year.
 * Therefore 1984 CE will be the leap year.
 * 
 * CE -> Century
 */
