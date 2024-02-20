package quiz.quiz3.question8;

public class Test {
    public static void main(String[] args) {
        //int score = 30; //Line n1
        char grade = 'F';  // Line n2
        // if (50 <= score < 60) { // Line n3
        //     grade = 'D';
        // } else if (60 <= score < 70) { // Line n4
        //     grade = 'C';
        // } else if (70 <= score < 80) { // Line n5
        //     grade = 'B';
        // } else if (score > 80)
        //     grade = 'A';
        System.out.println(grade);
    }
}
/*
 * Line n1 and Line n2 compile successfully.
 * 
 * Let's check the boolean expression of Line n3:
 * 
 * 50 <= score < 60
 * 
 * As multiple operators are available, so let's group the operators first on
 * the basis of precedence and associativity.
 * 
 * Relational operators (<, >, <= and >=) are at same level and left to right
 * associative, hence given expression can be grouped as:
 * 
 * (50 <= score) < 60
 * 
 * < is a binary operator with two operands: (50 <= score) on the left is of
 * boolean type and 60 on the right is of int type. But < operator is not
 * defined for boolean, int type and hence Line n3 causes compilation error.
 * Line n4 and Line n5 cause compilation error for the same reason.
 */
