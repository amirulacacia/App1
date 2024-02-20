package quiz.quiz3.question6;

public class Test {
    public static void main(String[] args) {
        boolean status = true;
        // System.out.println(status = false || status = true | status = false);
        System.out.println(status);
    }
}

/*
 * 1. The || operator has higher precedence than the | operator.
 * 2. The expression contains assignments (=) and logical OR (||).
 * 3. The logical OR (||) short-circuits if the first operand is true, meaning
 * the subsequent assignments won't be executed.
 * 
 * However, mixing logical OR (||) and bitwise OR (|) in the same expression
 * without proper parentheses can lead to confusion for the compiler.
 * 
 * To fix this, you should use parentheses to make the intent clear and avoid
 * mixing these operators in a way that might cause unexpected behavior:
 * 
 * System.out.println((status = false) || (status = true) | (status = false));
 * 
 * Here, the parentheses help to clarify the intended order of evaluation.
 * However, keep in mind that this expression involves assignments within a
 * print statement, which might not be considered good practice in typical code.
 * It's generally better to separate assignment statements from complex
 * expressions for clarity and readability.
 */
/*
 * System.out.println(status = false || status = true | status = false);
 * 
 * As it contains multiple operators, hence let's group the operators first.
 * 
 * System.out.println(status = false || status = (true | status) = false);
 * //Bitwise inclusive OR | has highest precedence over logical or || and
 * assignment =
 * 
 * For assignment operator to work, left operand must be variable but in above
 * case, `(true | status) = false` causes compilation failure as left operand
 * (true | status) evaluates to a boolean value and not boolean variable.
 */