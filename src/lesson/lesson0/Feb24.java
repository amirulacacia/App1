package lesson.lesson0;

public class Feb24 {

    public Feb24(String str) {
		System.out.println("This is a 1st main.");
        secondMain();
        SecondClass secondClass = new SecondClass();
        secondClass.secondMain();
        SecondClass.thirdMain();
        if (str.equals("February")) {
            ThirdClass.secondMain();
        }
        else {
            ThirdClass.thirdMain();
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
