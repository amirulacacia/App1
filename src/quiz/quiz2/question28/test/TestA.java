package quiz.quiz2.question28.test;

import quiz.quiz2.question28.A; //Line 3

public class TestA {
    public static void main(String[] args) {
        A obj = new A(); // Line 7
        System.out.println(obj.i1); // Line 8
        // System.out.println(obj.i2); //Line 9
        // System.out.println(obj.i3); //Line 10
        // System.out.println(obj.i4); //Line 11
    }
}

// Line 10 cause compilation error because of protected
// Line 11 cause compilation error because of default it will be
// package-private. Only public within same package.
// Line 12 cause compilation error because of private
