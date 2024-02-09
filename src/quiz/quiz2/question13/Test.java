package quiz.quiz2.question13;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.println("B");
        } catch (IOException e) {
            System.out.println("A");
        } /*
           * catch (FileNotFoundException e) {
           * System.out.println("B");
           * }
           */finally {
            System.out.println("C");
        }
    }
}

/*
 * FileNotFoundException extends IOException and hence catch block of
 * FileNotFoundException should appear before the catch block of IOException.
 * 
 * Therefore, class Test causes compilation error
 */
