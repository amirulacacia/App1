package quiz.quiz3.question16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("where");
        words.add("whether");

        // processStringArray(words, /*INSERT*/);
        processStringArray(words, p -> !!!!true); // Correct (Print All)
        // processStringArray(words, p -> p.length() < 7); // Wrong because wether String length is not less than 7
        // processStringArray(words, p -> p.length() >= 1); // Correct (Print All)
        // processStringArray(words, String p -> p.length() > 0); // Wrong because Round brackets or parenthesis are missing around 'String p'. This causes compilation error.
        // processStringArray(words, p -> !!false); // Wrong becaue not print anything
        // processStringArray(words, p -> true); // Correct (Print All)
        // processStringArray(words, (String p) -> p.length() < 100); // Correct (Print All)

    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
