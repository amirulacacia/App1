package quiz.quiz2.question22;

public class Test {
    public static void main(String[] args) {
        final String fName = "James"; // fName will be a constant because of final
        String lName = "Gosling";

        // fName + lName is not a constant expression.
        String name1 = fName + lName;
        // fName + "Gosling" is a constant expression.
        String name2 = fName + "Gosling";
        // "James" + "Gosling" is a constant expression.
        String name3 = "James" + "Gosling";

        // false because one is not constant and one is constant
        System.out.println(name1 == name2);
        // true because both is constant expression
        System.out.println(name2 == name3);

        // So to make both true, you need to use .equals because this will compare both
        // object in terms of value, not type
    }
}
