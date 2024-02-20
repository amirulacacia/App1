package quiz.quiz3.question69;

import java.io.IOException;

// So this extends class will always call the contructor of parents 
// first then the subclass even without super()
class Sub extends Super {
    Sub() throws IOException {
        System.out.println("DIEM");
    }
}
