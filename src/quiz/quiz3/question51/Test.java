package quiz.quiz3.question51;

public class Test {
    public static void main(String[] args) {
        int var = 3;
        String[][] arr = new String[--var][var++];
        arr[1][1] = "X";
        arr[1][2] = "Y";
        for (String[] arr1 : arr) {
            for (String s : arr1) {
                if (s != null) {
                    System.out.println(s);
                }
            }
        }
    }
}

/*
 * Line n1:
 * 
 * String [][] arr = new String[--var][var++]; //var = 3
 * 
 * Access array element operator [] is left to right associative.
 * 
 * => String [][] arr = new String[2][var++]; //var = 2, var is decremented
 * first and then used in the expression.
 * 
 * => String [][] arr = new String[2][2]; //var = 3, value of var is used first
 * and then it is incremented by 1
 * 
 * Hence, arr refers to 2-dimensional String array object {{null, null}, {null,
 * null}}.
 * 
 * At Line n2, arr[1][1] = "X"; assigns "X" to element at index [1][1],
 * therefore arr --> {{null, null}, {null, "X"}}
 * 
 * At Line n3, arr[1][2] = "Y"; causes ArrayIndexOutOfBoundsException as 2nd
 * index 2 is out of range.
 * 
 * As Line n3 throws Exception at runtime, hence for loop will not be executed.
 */