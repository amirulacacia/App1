package lesson.lesson8.assignmentjavagenericclasses.genericmap;

public class Main {
    public static void main(String[] args) {
        // Example usage with Integer keys and String values
        GenericMap<String, String> myMap = new GenericMap<>();
        myMap.add("Malaysia", "Kuala Lumpur");
        myMap.add("Indonesia", "Jakarta");

        // Retrieving values based on keys
        System.out.println("Value for key Malaysia: " + myMap.get("Malaysia"));  // Output: Kuala Lumpur
        System.out.println("Value for key Indonesia: " + myMap.get("Indonesia"));  // Output: Indonesia

        // Checking if a key exists
        System.out.println("Contains key Singapore: " + myMap.containsKey("Singapore"));  // Output: false

        // Removing a key-value pair
        myMap.remove("Indonesia");
        System.out.println("Value for key Indonesia after removal: " + myMap.get("Indonesia"));  // Output: null
    }
}
