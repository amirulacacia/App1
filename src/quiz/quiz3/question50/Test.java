package quiz.quiz3.question50;

/*
 * 50. Given code of Test.java file,  Which of the following statements is correct?
 */

interface Document {
    default String getType() {
        return "TEXT";
    }
}

interface WordDocument extends Document {
    String getType();
}

// Uncomment This to see the question
// class Word implements WordDocument {

// }

// Comment all this class to see the question
class Word implements WordDocument {

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

}

public class Test {
    public static void main(String[] args) {
        Document doc = new Word();
        System.out.println(doc.getType());
    }
}

/*
 * 1. Interface Document causes compilation error (Wrong)
 * 2. Interface WordDocument causes compilation error (Wrong)
 * 3. Test class compiles successfully and on execution prints TEXT on to the
 * console (Wrong)
 * 4. Class Word causes compilation error (Correct)
 */

/*
 * As per Java 8, default methods were added in the interface. Interface
 * Document defines default method getType(), there is no compilation error in
 * interface Document. Method getType() is implicitly public in Document.
 * 
 * interface WordDocument extends Document and it overrides the default method
 * getType() of Document, overriding method in WordDocument is implicitly
 * abstract and public. An interface in java can override the default method of
 * super type with abstract modifier. interface WordDocument compiles
 * successfully.
 * 
 * class Word implements WordDocument and as WordDocument interface has abstract
 * method getType(), and as class Word doesn't implement the getType() method
 * hence it causes compilation failure.
 */
