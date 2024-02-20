package quiz.quiz3.question69;

public class Test {
    public static void main(String[] args) throws Exception {
        new Sub();
    }
}

/*
 * It is legal for the constructors to have throws clause.
 * 
 * Constructors are not inherited by the Sub class so there is no method
 * overriding rules related to the constructors but as one constructor invokes
 * other constructors implicitly or explicitly by using this(...) or super(...),
 * hence exception handling becomes interesting.
 * 
 * Java compiler adds super(); as the first statement inside Sub class's
 * constructor:
 * 
 * Sub() throws IOException {
 * super(); //added by the compiler
 * System.out.println("DIEM");
 * }
 * 
 * super(); invokes the constructor of Super class (which declares to throw
 * RuntimeException), as RuntimeException is unchecked exception, therefore no
 * handling is necessary in the constructor of Sub class.
 * 
 * Sub class's constructor declares to throw IOException but main(String [])
 * method handles it.
 * 
 * There is no compilation error and output is: CARPE DIEM
 */
