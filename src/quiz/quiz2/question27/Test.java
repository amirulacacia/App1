package quiz.quiz2.question27;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Child());
    }
}

/*
 * System.out.println(new Child()); invokes the toString() method on Child's
 * instance.
 * 
 * Parent class's method can be invoked by super keyword. super.toString()
 * method returns "Inner " and "Inner ".concat("Peace!") returns "Inner Peace!".
 */
