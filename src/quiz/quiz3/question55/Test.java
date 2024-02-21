package quiz.quiz3.question55;

class Super {
    Super() {
        System.out.println("Reach");
    }
}

class Sub extends Super {
    Sub() {
        //Super();
        System.out.println("Out");
    }
}

public class Test {
    public static void main(String[] args) {
        new Sub();
    }
}

/*
 * Parent (Super) class constructor is invoked by `super();` (all letters in
 * lowercase) from within the constructor of subclass.
 * 
 * First statement inside no-argument constructor of Sub class is: `Super();`
 * (Letter 'S' is in uppercase) and hence it causes compilation error.
 */