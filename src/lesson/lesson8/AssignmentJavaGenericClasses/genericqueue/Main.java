package lesson.lesson8.assignmentjavagenericclasses.genericqueue;

public class Main {
    public static void main(String[] args) {
        GenericQueue<String> games = new GenericQueue<>();
        games.enqueue("Call of Duty");
        games.enqueue("Minecraft");
        games.enqueue("Ultraman");
        games.enqueue("Digimon");
        games.enqueue("Pokemon");
        games.enqueue("Palword");
        games.enqueue("Oxygen Not Included");
        games.enqueue("Craftopia");
        games.enqueue("Monopoly");
        games.enqueue("Apex Legends");
        games.enqueue("League of Legends");
        while (!games.isEmpty()) {
            System.out.println("Dequeue: " + games.dequeue());
        }

        GenericQueue<Integer> integerQueue = new GenericQueue<>();
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);
        integerQueue.enqueue(4);
        integerQueue.enqueue(5);
        integerQueue.enqueue(6);
        while (!integerQueue.isEmpty()) {
            System.out.println("Dequeue: " + integerQueue.dequeue());
        }
    }

}
