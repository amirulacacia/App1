package quiz.quiz2.question19;

public interface I1 {
    void m1() throws java.io.IOException;
}

// public class C1 implements I1 { public void m1() {} }
// public class C2 implements I1 { public void m1() throws
// java.io.FileNotFoundException{} }
// public class C3 implements I1 { public void m1() throws java.io.IOException{}
// }
// public class C4 implements I1 { public void m1() throws Exception {} }

// C1, C2 and C3 were correct
// C4 were wrong

/*
 * NOTE: Question is asking for "incorrect" implementation and not "correct"
 * implementation.
 * 
 * According to overriding rules, if super class / interface method declares to
 * throw a checked exception, then overriding method of sub class / implementer
 * class has following options:
 * 
 * 1. May not declare to throw any checked exception,
 * 
 * 2. May declare to throw the same checked exception thrown by super class /
 * interface method,
 * 
 * 3. May declare to throw the sub class of the exception thrown by super class
 * / interface method,
 * 
 * 4. Cannot declare to throw the super class of the exception thrown by super
 * class / interface method
 */