public class App {
    public static void main(String[] args) {

        System.out.println("Hello World. This is my");
        secondMain();
        SecondClass secondClass = new SecondClass();
        secondClass.secondMain();
        SecondClass.thirdMain();
        ThirdClass.secondMain();
    }

    public static void secondMain(){

        System.out.println("This is a 2nd main.");
    }
}

class SecondClass {
    
    public void secondMain(){
        System.out.println("This is a 2nd main inside 2nd class.");
    }

    public static void thirdMain(){
        System.out.println("This is a 3rd main inside 2nd class.");
    }
}

class ThirdClass {

    static void secondMain(){
        System.out.println("This is a 2nd main inside 3rd class.");
    }
}
