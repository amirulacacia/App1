public class App {
    public static void main(String[] args) {

        System.out.println("Hello World. " + args[0] + " " + args[1]);
        secondMain();
        SecondClass secondClass = new SecondClass();
        secondClass.secondMain();
        SecondClass.thirdMain();
        if (args[1].equals("February")) {
            ThirdClass.secondMain();
        }
        else {

        }
        
    }

    public static void secondMain(){

        System.out.println("This is a 2nd main.");
    }
}

class SecondClass {
    
    void secondMain(){
        System.out.println("This is a 2nd main inside 2nd class.");
    }

    static void thirdMain(){
        System.out.println("This is a 3rd main inside 2nd class.");
    }
}

class ThirdClass {

    static void secondMain(){
        System.out.println("Today is a February Month");
    }

    static void thirdMain(){
        System.out.println("We are not in the month of February");

    }
}
