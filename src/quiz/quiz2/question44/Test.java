package quiz.quiz2.question44;

import java.util.ArrayList;
import java.util.List;

public class Test {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(27);
        list.add(27);

        list.add(new Integer(27));
        list.add(new Integer(27));

        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(2) == list.get(3));
    }
}

/*
 * This is bit tricky. Just remember this:
 * 
 * Two instances of following wrapper objects, created through auto-boxing will
 * always be same, if their primitive values are same:
 * 
 * Boolean,
 * 
 * Byte,
 * 
 * Character from \u0000 to \u007f (7f equals to 127),
 * 
 * Short and Integer from -128 to 127.
 * 
 * For 1st statement, list.add(27); => Auto-boxing creates an integer object for
 * 27.
 * 
 * For 2nd statement, list.add(27); => Java compiler finds that there is already
 * an Integer object in the memory with value 27, so it uses the same object.
 * 
 * That is why System.out.println(list.get(0) == list.get(1)); returns true.
 * 
 * new Integer(27) creates a new Object in the memory, so
 * System.out.println(list.get(2) == list.get(3)); returns false.
 */