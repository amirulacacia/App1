package quiz.quiz3.question58;

public class Test {
    static String str = "KEEP IT "; // Line n1

    public static void main(String[] args) {
        //String str = str + "SIMPLE"; // Line n2
        System.out.println(str);
    }
}
/*
 * In line n2, you are trying to initialize a local variable str with itself
 * concatenated with "SIMPLE". However, the local variable str is shadowing the
 * static variable str declared at the class level (Line n1). This creates
 * ambiguity for the compiler.
 * 
 * To fix this issue, you should avoid shadowing the class-level variable by
 * using a different name for the local variable. For example:
 * 
 */

//  public class Test {
//     static String str = "KEEP IT "; // Line n1

//     public static void main(String[] args) {
//         String newStr = str + "SIMPLE"; // Use a different name for the local variable
//         System.out.println(newStr);
//     }
// }

/*
 * At Line n2, local variable 'str' shadows the static variable 'str' created at
 * Line n1. Hence, for the expression `str + "SIMPLE"`, Java compiler complains
 * as local variable 'str' is not initialized.
 */
