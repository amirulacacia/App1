package quiz.quiz1.question3;

abstract class BeachTraveller extends Traveller {

    /*****************************************************
     * ✓ This is method overloading. BeachTraveller has 2 methods:
     * `void travel(String){}` and `public void travel() throws
     * RuntimeException {}`.
     ******************************************************/
    // public void travel() throws RuntimeException{}

    /*****************************************************
     * ✓ This is method overloading.
     * BeachTraveller has 2 methods: `void travel(String){}`
     * and `abstract void travel()`.
     ******************************************************/
    // abstract void travel();

    /*****************************************************
     * ✓ As BeachTraveller is abstract, hence
     * travel(String) method can be declared abstract.
     ******************************************************/
    // abstract void travel(String beach);

    /*****************************************************
     * ✓ This is method overloading. BeachTraveller has 2 methods:
     * `void travel(String){}` and `abstract void travel()`.
     ******************************************************/
    // public abstract void travel();

    /*****************************************************
     * ✗ As overridden method doesn't declare to throw any
     * checked Exception hence overriding method is not allowed
     * to declare to throw Exception.
     ******************************************************/
    // public void travel(String beach) throws Exception{}

    /*****************************************************
     * ✓ This is method overloading. BeachTraveller has 2
     * methods: `void travel(String){}` and
     * `public void travel(Object){}`.
     ******************************************************/
    // public void travel (Object obj){}

    /*****************************************************
     * ✗ As overridden method doesn't declare to throw any
     * checked Exception hence overriding method is not allowed
     * to declare to throw java.io.IOException.
     ******************************************************/
    // void travel(String beach) throws java.io.IOException{}

}
