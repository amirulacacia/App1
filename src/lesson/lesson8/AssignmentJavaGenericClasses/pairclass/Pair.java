package lesson.lesson8.assignmentjavagenericclasses.pairclass;

public class Pair<A,B> {
    private A first;
    private B second;

    public Pair(A element1, B element2){
        this.first = element1;
        this.second = element2;
    }

    public A getFirst(){
        return this.first;
    }

    public void setFirst(A element){
        this.first = element;
    }

    public B getSecond(){
        return this.second;
    }

    public void setSecond(B element){
        this.second = element;
    }
}
