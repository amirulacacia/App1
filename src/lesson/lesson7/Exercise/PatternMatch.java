package lesson.lesson7.exercise;

import java.util.regex.Pattern;
import java.util.regex.Matcher;;

public class PatternMatch {
    public void patternMatcher() {
        // Define the pattern you want to match
        String patternString = "Hello, (\\w+)! (\\w+)"; // The text expression "(\\w+)" will be used as
                                                        // capture group for the matcher
        Pattern pattern = Pattern.compile(patternString);

        // Input text to be matched
        String inputText = "Hello, John! How are you doing today?";

        // Create a Matcher object
        Matcher matcher = pattern.matcher(inputText);

        // Check for matches
        while (matcher.find()) {
            // Print the matched group
            System.out.println("Match found: " + matcher.group(0));
            System.out.println("Capture group 1: " + matcher.group(1));
            System.out.println("Capture group 2: " + matcher.group(2));
        }
    }
}
