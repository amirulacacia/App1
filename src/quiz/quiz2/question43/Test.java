package quiz.quiz2.question43;

public class Test {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 17;
        p1.y = 35;
        p1.z = -1;

        Point p2 = new Point();
        p2.x = 19;
        p2.y = 40;
        p2.z = 0;

        System.out.println(p1);
        System.out.println(p2);
    }
}

/*
 * Point class correctly overrides the toString() method. Even though variable x
 * is static, but it can be easily accessed by instance method toString().
 * 
 * Variables x, y and z are declared with default scope, so can be accessed in
 * same package. There is no compilation error in the code.
 * 
 * There is only one copy of static variable for all the instances of the class.
 * Variable x is shared by p1 and p2 both.
 * 
 * p1.x = 17; sets the value of static variable x to 17, p2.x = 19; modifies the
 * value of static variable x to 19. As there is just one copy of x, hence p1.x
 * = 19
 * 
 * Please note: p1.x and p2.x don't cause any compilation error but as this
 * syntax creates confusion, so it is not a good practice to access the static
 * variables or static methods using reference variable, instead class name
 * should be used. Point.x is the preferred syntax.
 * 
 * Each object has its own copy of instance variables, so just before executing
 * Line n1, p1.y = 35 & p1.z = -1 AND p2.y = 40 & p2.z = 0
 * 
 * Output is:
 * 
 * Point(19, 35, -1)
 * 
 * Point(19, 40, 0)
 */
