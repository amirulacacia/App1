package lesson.lesson8.assignmentjavagenericclasses.genericlinkedlist;

public class Main {
    public static void main(String[] args) {
        // Testing with Integer
        GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.print("Integer List: "); integerList.display();
        integerList.remove(2);
        System.out.print("Integer List after removing 2: "); integerList.display();

        // Testing with String
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.print("String List: "); stringList.display();
        stringList.remove("Hello");
        System.out.print("String List after removing 'Hello': "); stringList.display();

        // Testing with Character
        GenericLinkedList<Character> charList = new GenericLinkedList<>();
        charList.add('A');
        charList.add('B');
        System.out.print("Character List: "); charList.display();
        charList.remove('A');
        System.out.print("Character List after removing 'A': ");  charList.display();
    }
}
