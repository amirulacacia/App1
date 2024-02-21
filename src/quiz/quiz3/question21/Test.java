package quiz.quiz3.question21;

public class Test {
    public static void main(String[] args) {
        int elements = 0;
        Object[] arr = { "A", "E", "I", new Object(), "O", "U" }; // Line n1
        for (Object object : arr) { // Line n2
            if (object instanceof String) {
                continue;
            } else {
                break;
            }
            //elements++; // Line n3
        }
        System.out.println(elements); // Line n4
    }
}
/*
 * Line n1 and Line n2 don't cause any compilation error.
 * 
 * if-else block uses break; and continue; statements. break; will exit the loop
 * and will take the control to Line n4 on the other hand continue; will take
 * the control to Line n2. In both the cases Line n3 will never be executed.
 * 
 * As Compiler knows about it, hence it tags Line n3 as unreachable, which
 * causes compilation error.
 */
