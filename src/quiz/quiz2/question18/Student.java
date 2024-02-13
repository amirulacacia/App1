package quiz.quiz2.question18;

public class Student {
    String name;
    int age;

    Student() {
        
        //Student("James", 25); // This cause compilation error.
        this("James", 25); // to call another constructor if there is not value.
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
 * A constructor can call another constructor by using this(...) and not the
 * constructor name.
 * 
 * Hence Student("James", 25); causes compilation error.
 */
