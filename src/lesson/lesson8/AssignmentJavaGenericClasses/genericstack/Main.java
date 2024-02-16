package lesson.lesson8.assignmentjavagenericclasses.genericstack;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> games = new GenericStack<>();
        System.out.println("Checking games on top: " + games.peek());
        games.push("Call of Duty");
        games.push("Minecraft");
        System.out.println("Checking games on top: " + games.peek());
        games.push("Ultraman");
        games.push("Digimon");
        games.push("Pokemon");
        games.push("Palword");
        games.push("Oxygen Not Included");
        games.push("Craftopia");
        games.push("Monopoly");
        games.push("Apex Legends");
        games.push("League of Legends");
        System.out.println("Checking games on top: " + games.peek());
        System.out.println("Popped: " + games.pop());
        System.out.println("Checking games on top: " + games.peek());
        while (!games.isEmpty()) {
            System.out.println("Popped: " + games.pop());
        }

        GenericStack<Integer> integerStack = new GenericStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);

        System.out.println("Peek: " + integerStack.peek());
        while (!integerStack.isEmpty()) {
            System.out.println("Popped: " + integerStack.pop());
        }
    }
}
