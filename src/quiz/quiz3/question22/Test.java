package quiz.quiz3.question22;

/*
 * 22. Consider below codes of 2 java files, Which of the following statements 
 * is correct?
 */

public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        GetSetGo[] arr = new GetSetGo[5]; // Line n2
        for (GetSetGo obj : arr) {
            //obj.count++; // Line n3
        }
        System.out.println(GetSetGo.count); // Line n4
    }
}
/*
 * In Java, interface fields are implicitly public, static, and final.
 * Therefore, the count field in the GetSetGo interface is implicitly public,
 * static, and final. Since it is final, it cannot be modified, and attempting
 * to do so will result in a compilation error.
 * 
 * So, when you try to increment obj.count++ inside the loop, you will get a
 * compilation error because you are attempting to modify a final variable.
 */

/*
 * Variable 'count' declared inside interface GetSetGo is implicitly public,
 * static and final. Line n1 compiles successfully.
 * 
 * Line n2 creates one dimensional array of 5 elements of GetSetGo type and all
 * 5 elements are initialized to null. Line n2 compiles successfully.
 * 
 * Though correct way to refer static variable is by using the type name, such
 * as GetSetGo.count but it can also be invoked by using GetSetGo reference
 * variable. Hence, obj.count at Line n3 correctly points to the count variable
 * at Line n1. But as variable 'count' is implicitly final, therefore
 * obj.count++ causes compilation error. Line n3 fails to compile.
 * 
 * Line n4 compiles successfully as variable 'count' is implicitly static and
 * GetSetGo.count is the correct syntax to point to 'count' variable of
 * interface GetSetGo.
 */
