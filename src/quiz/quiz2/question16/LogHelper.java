package quiz.quiz2.question16;

public class LogHelper extends Helper {
    //private int num = 200;
    protected String operation = "LOGGING";

    @Override
    //void help() {
    protected void help() {
        System.out.println("LogHelper-help");
    }

    //void log() {
    public void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String[] args) {
        new LogHelper().help();
    }
}

/*
 * Let us first find out the issue:
 * 
 * As instance variables are hidden by subclasses and not overridden, hence
 * overriding rules are not for the instance variables. There are no issues with
 * variables 'num' and 'operation'.
 * 
 * log() method is declared with default modifier in both the classes, hence no
 * issue with log() method as well.
 * 
 * abstract method help() is declared with protected modifier in Helper class
 * and in LogHelper class, it is overridden with default modifier and this
 * causes compilation error. So below solutions to resolved this issue:
 * 
 * 1. Remove the protected modifier from the help() method of Helper class: Both
 * the overridden and overriding methods will have same default modifier, which
 * is allowed
 * 
 * OR
 * 
 * 2. Add the protected modifier to the help() method of LogHelper class: Both
 * the overridden and overriding methods will have same protected modifier,
 * which is allowed
 * 
 * OR
 * 
 * 3. Add the public modifier to the help() method of LogHelper class:
 * Overridden method will have protected modifier and overriding method will
 * have public modifier, which is allowed
 */
