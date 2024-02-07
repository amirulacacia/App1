package quiz.quiz1.question5;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome " + args[0] + "!");
    }

    /***************************************************************
     * If passed command line arguments contain space between such
     * as James Gosling or Bill Joy, it is a common practice to
     * enclosed it within double quotes like this "James Gosling".
     * 
     * In this case "James Gosling" is passed as one String object.
     * Using command Java Test.java "James Gosling" "Bill Joy" on
     * terminal, will passes new String[]("James Gosling", "Bill Joy")
     * to args of main method.
     * 
     * So, args[0] refers to "James Gosling" and args[1] refers to "Bill Joy".
     * This will print Welcome James Gosling! on console.
     * 
     ***************************************************************/
}
