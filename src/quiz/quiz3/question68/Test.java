package quiz.quiz3.question68;

class Paper {
    static String getType() { // Line n1
        return "GENERIC";
    }

}

class RuledPaper extends Paper {
    // String getType() { // Line n2
    //     return "RULED";
    // }
}

public class Test {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Paper paper = new RuledPaper(); // Line n3
        System.out.println(paper.getType()); // Line n4
    }
}

/*
 * Instance method of subclass cannot override the static method of superclass.
 * 
 * Instance method at Line n2 tries to override the static method at Line n1 and
 * hence Line n2 causes compilation error.
 * 
 * There is no issue with Line n3 as reference variable of superclass can refer
 * to an instance of subclass.
 * 
 * At Line n4, paper.getType() doesn't cause compilation error but as this
 * syntax creates confusion, so it is not a good practice to access the static
 * variables or static methods using reference variable, instead class name
 * should be used. Paper.getType() is the preferred syntax.
 */
