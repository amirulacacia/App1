package lesson.lastlesson;

public class Boot {
    static String s;

    /*
     * Static initializer blocks always execute before the instance initialization
     * blocks because static blocks run at the time of class loading. However, the
     * instance block runs at the time of instance creation.
     */

    // Static Initialize Block (Executes only once during the class loading)
    static {
        s = "";
    }

    static {
        System.out.println(s.concat("strong "));
    }

    // Instance Initializer Block ( the purpose of the instance initializer block is
    // to initialize the instance data members. )
    {
        System.out.println("shinier ");
    }

    static {
        System.out.println(s.concat("better "));
    }

    Boot() {
        System.out.println(s.concat("bigger "));
    }

    public static void main(String[] args) {
        new Boot();
        System.out.println("boot");
    }
}