package quiz.quiz1.question2;

public class Test {
    static int i1 = 10;
    int i2 = 20;

    int add() {
        //Due to i1 is static variable and i2 is instance variable.
        //Preferred way to access static variable i1 inside add() method,
        //is by using 'i1' or 'Test.i1'. EEven though 'this.i1' 
        //is not the recommended way but it works.
        //And instance variable i2 can be accessed inside add() method 
        //by using 'i2' or 'this.i2'. Hence, Line n1 compiles successfully.
        //Correction:
        //return this.i1 + this.i2;
        //Answer:
        return Test.i1 + this.i2;
    }

    public static void main(String[] args) {
        System.out.println(new Test().add());
    }
}
