package lesson.lastlesson;

import java.util.Random;

class Parent{
    double allowance = 2;

    void money(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    double allowance = 4;

    void money(){
        System.out.println("Parent");
    }
}

class GrandChild extends Child{
    double allowance = 6;

    void money(){
        System.out.println("Parent");
    }
}


public class InheritanceTesting {
    static String asd;
    
    public static void main(String[] args) {
        Parent obj = new Parent();
        // System.out.println(((Child)obj).allowance);

        Random rando =  new Random();
        rando.setSeed(0);

        

        System.out.println(asd + "hello");
        asd.concat("hello");
        int i = 10;
        System.out.println(i);
        System.out.println(obj.allowance);
        change(obj);
        System.out.println(obj.allowance);
        change2(obj);
        System.out.println(obj.allowance);
        return;
    }

    static void change(Parent x){
        x.allowance = 4;
    }

    static void change2(Parent x){
        x = null;
        x = new Parent();
        x.allowance = 3;
    }
}
