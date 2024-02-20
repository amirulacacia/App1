package quiz.quiz3.question15;

/*
 * 15. Consider below code snippet, Which of the options are correct so that
 * instance variables 'testNo' and 'desc' are accessible only within
 * 'com.udayankhattry.oca' package?
 */

public class Test {
    String testNo;
    String desc;

    /*
     * Other codes...
     */
}

/*
 * As member variables 'testNo' and 'desc' are declared with no explicit access
 * specifier, this means these variables have package scope, hence these
 * variables are accessible only to classes within the same package. Hence, no
 * changes are necessary.
 * 
 * If you use private, then instance variables will not be accessible to any
 * other classes, even within the same package.
 * 
 * If you use protected, then instance variables will be accessible to the
 * subclasses outside 'com.udayankhattry.oca' package.
 * 
 * If you use public, then instance variables will be accessible to all the
 * classes.
 */