package lesson.lesson8.assignmentjavagenericclasses.pairclass;

public class Main {
    public static void main(String[] args) {
        Pair<String,String> pair = new Pair<>("Fire", "Water");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());
        pair.setFirst("Earth");
        pair.setSecond("Wind");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        Pair<Double,String> pair2 = new Pair<>(2.5, "pH");
        System.out.println("First element: " + pair2.getFirst());
        System.out.println("Second element: " + pair2.getSecond());
        pair2.setFirst(9.0);
        pair2.setSecond("Humidity");
        System.out.println("First element: " + pair2.getFirst());
        System.out.println("Second element: " + pair2.getSecond());
    }
}
