package quiz.quiz3.question57;

public class Test {
    public static void main(String[] args) {
        String text = "RISE ";
        text = text + (text = "ABOVE ");
        System.out.println(text);
    }
}

/*
 * Initially text refers to "RISE ".
 * 
 * Given statement:
 * 
 * text = text + (text = "ABOVE ");
 * 
 * text = "RISE " + (text = "ABOVE "); //Left operand of + operator is evaluated
 * first, text --> "RISE "
 * 
 * text = "RISE " + "ABOVE "; //Right operand of + operator is evaluated next,
 * text --> "ABOVE "
 * 
 * text = "RISE ABOVE "; //text --> "RISE ABOVE "
 * 
 * Hence `System.out.println(text);` prints 'RISE ABOVE ' on to the console.
 */