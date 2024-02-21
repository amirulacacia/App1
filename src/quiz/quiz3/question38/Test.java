package quiz.quiz3.question38;

/*
 * 38. Given code of Test.java file, Which of the following options is correct?
 */

class A {
    public static void main(String[] args) {
        System.out.println("A");
    }
}

class B {
    public static void main(String[] args) {
        System.out.println("B");
    }
}

class C {
    public static void main(String[] args) {
        System.out.println("C");
    }
}

class D {
    public static void main(String[] args) {
        System.out.println("D");
    }
}
/*
 * 1. Test.java file will compile successfully but expected output is not
 * possible (Wrong)
 * 2. To print C on to the console, execute below commands: javac Test.java java
 * Test (Wrong)
 * 3. To print C on to the console, execute below commands:
 * javac C.java java C (Wrong)
 * 4. To print C on to the console, execute below commands:
 * javac Test.java java C (Correct)
 * 5. Test.java file is not a valid java file as it doesn't contain code for
 * class Test (Wrong)
 */

/*
 * Test.java is a valid java file. As none of the classes in Test.java file are
 * public, hence file name can use any valid Java identifier.
 * 
 * As file name is Test.java, hence to compile the code below command is used:
 * 
 * javac Test.java
 * 
 * Execution of above command creates 4 class files: A.class, B.class, C.class &
 * D.class.
 * 
 * To print C on to the console, class C must be executed. To execute C class,
 * command is:
 * 
 * java C
 */