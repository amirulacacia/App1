package assignment.assignment1;

public class Assignment1 {

    // Main method
    public static void main(String[] args) {
        /*****************************************************
         * Passing Arguments
         * Arguments were passed from launch.json or terminal,
         * and being passed to the main. Below, the number of
         * arguments received will be display and each arguments
         * will be listed as below.
         *****************************************************/
        // Display number of arguments received
        System.out.println("Number of arguments: " + args.length);

        // Listing all arguments
        System.out.println("\nListing all the arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ". " + args[i]);
        }

        /*****************************************************
         * Undestanding Data Types
         * Each data types variable were declared and will be
         * display. The non-String data types can also be converted
         * to String data types and will be display as
         * String data types.
         *****************************************************/
        // Declare data type
        int integerNumber = 10;
        double doubleNumber = 3.14;
        boolean boolValue = true;
        char charValue = 'A';
        String stringValue = "Hello, World!";

        // Display value of each data type
        System.out.println("\nListing all the data type value:");
        System.out.println("Integer Number: " + integerNumber);
        System.out.println("Double Number: " + doubleNumber);
        System.out.println("Boolean Value: " + boolValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("String Value: " + stringValue);

        // Converting non-String data types to String
        String integerString = String.valueOf(integerNumber);
        String doubleString = String.valueOf(doubleNumber);
        String boolString = String.valueOf(boolValue);
        String charString = String.valueOf(charValue);

        // Display each value in String data types
        System.out.println("\nDisplaying all data type in String data type:");
        System.out.println("Integer Number: " + integerString);
        System.out.println("Double Number: " + doubleString);
        System.out.println("Boolean Value: " + boolString);
        System.out.println("Character Value: " + charString);
        System.out.println("String Value: " + stringValue);

    }
}
