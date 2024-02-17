package lesson.lesson8.assignmentjavagenericclasses.genericqueue;

import java.util.LinkedList;

public class GenericQueue<T> {
    private LinkedList<T> queue;

    public GenericQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("There is no item inside the queue");
            return null;
        } else {
            return queue.removeFirst();
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

}