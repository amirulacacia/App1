package quiz.quiz3.question48;

public class Test {
    public static void main(String[] args) {
        String str = "PANIC";
        StringBuilder sb = new StringBuilder("THET");
        System.out.println(str.replace("N", sb));
    }
}
/*
 * String class has following two overloaded replace methods:
 * 
 * 1. public String replace(char oldChar, char newChar) {}:
 * 
 * Returns a string resulting from replacing all occurrences of oldChar in this
 * string with newChar. If no replacement is done, then source String object is
 * returned. e.g.
 * 
 * "Java".replace('a', 'A') --> returns new String object "JAvA".
 * 
 * "Java".replace('a', 'a') --> returns the source String object "Java" (no
 * change).
 * 
 * "Java".replace('m', 'M') --> returns the source String object "Java" (no
 * change).
 * 
 * 2. public String replace(CharSequence target, CharSequence replacement) {}:
 * 
 * Returns a new String object after replacing each substring of this string
 * that matches the literal target sequence with the specified literal
 * replacement sequence. e.g.
 * 
 * "Java".replace("a", "A") --> returns new String object "JAvA".
 * 
 * "Java".replace("a", "a") --> returns new String object "Java" (it replaces
 * "a" with "a").
 * 
 * "Java".replace("m", "M") --> returns the source String object "Java" (no
 * change).
 * 
 * As String, StringBuilder and StringBuffer all implement CharSequence, hence
 * instances of these classes can be passed to replace method. Line n1 compiles
 * successfully and on execution replaces "N" with "THET", and hence Line n1
 * prints PATHETIC on to the console.
 */
