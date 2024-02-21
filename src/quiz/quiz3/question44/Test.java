package quiz.quiz3.question44;

class Super {
    public String num = "10"; // Line n1
}

class Sub extends Super {
    protected int num = 20;
}

public class Test {
    public static void main(String[] args) {
        Super obj = new Sub();
        System.out.println(obj.num += 2);
    }
}

/*
 * Subclass overrides the methods of superclass but it hides the variables of
 * superclass.
 * 
 * Line n2 hides the variable created at Line n1, there is no rules related to
 * hiding (type and access modifier can be changed).
 * 
 * 'obj' is of Super type, hence obj.num refers to num variable at Line n1,
 * which is of String type.
 * 
 * Expression at Line n3:
 * 
 * obj.num += 2
 * 
 * => obj.num = obj.num + 2
 * 
 * => obj.num = "10" + 2
 * 
 * => obj.num = "102"
 * 
 * obj.num refers to "102" and same is printed on to the console.
 */
