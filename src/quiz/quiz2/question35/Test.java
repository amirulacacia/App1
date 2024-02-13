package quiz.quiz2.question35;

public class Test {
    public static void main(String[] args) {
        String[][] fruits = { { "apple", "mango" }, { "orange", "grape" } };
        // which options, if used to replace /*INSERT*/, will print
        // "apple mango orange grape " on to the console?
        /* INSERT */

        /* OPTION 1 */ // Correct // /*apple mango orange grape */
        /// *
        for (int i = 0; i < fruits.length; i++)
            for (int j = 0; j < fruits[i].length; j++)
                System.out.print(fruits[i][j] + " ");
        // */

        /* OPTION 2 */ // Wrong // /* grape */
        /*
         * for (int i = 1; i < fruits.length; i++)
         * for (int j = 1; j < fruits[i].length; j++)
         * System.out.print(fruits[i][j] + " ");
         */

        /* OPTION 3 */ // Wrong // /*ArrayIndexOutOfBoundsException */
        /*
         * for (int i = 1; i < fruits.length; i++)
         * for (int j = 1; j <= fruits[i].length; j++)
         * System.out.print(fruits[i][j] + " ");
         */

        /* OPTION 4 */ // Correct // /* apple mango orange grape */
        /*
         * for (String[] arr : fruits)
         * for (String fruit : arr)
         * System.out.print(fruit + " ");
         */
    }
}

/*
 * Easy question on iterating through 2-dimensional array. Starting index should
 * be 0 and not 1. Enhanced for loop syntax is correct.
 * 
 * As for loops contain 1 statement, hence curly brackets can be ignored.
 */
