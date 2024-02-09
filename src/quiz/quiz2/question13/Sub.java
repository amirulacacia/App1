package quiz.quiz2.question13;

import java.io.FileNotFoundException;
import java.io.IOException;

class Sub extends Super{
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
    
}
