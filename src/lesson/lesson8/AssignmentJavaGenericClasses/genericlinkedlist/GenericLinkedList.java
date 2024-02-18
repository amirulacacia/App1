package lesson.lesson8.assignmentjavagenericclasses.genericlinkedlist;

public class GenericLinkedList<T> {
    private Node<T> head;

    public GenericLinkedList() {
        this.head = null;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item); // Create a new node with the given item.
        if (head == null) {
            // If the linked list is empty (head is null), set the new node as the head.
            head = newNode;
        } else {
            // If the linked list is not empty, traverse to the end and add the new node.
            Node<T> current = head; // Start from the head of the linked list.
            while (current.next != null) {
                // Traverse the linked list until the last node is reached.
                current = current.next;
            }
            current.next = newNode; // Set the next of the last node to the new node.
        }
    }

    public void remove(T item) {
        if (this.isEmpty()) {
            // If the linked list is empty, nothing to remove, so return.
            return;
        }

        if (head.data.equals(item)) {
            // If the item to be removed is at the head, update the head to the next node.
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(item)) {
            // Traverse the linked list until the node with the specified item is found.
            current = current.next;
        }

        if (current.next != null) {
            // If the node with the specified item is found, update the next reference to
            // skip that node.
            current.next = current.next.next;
        }
    }

    public void display() {
        Node<T> current = head;
        System.out.print("[" + current.data);
        while (current.next != null) {
            System.out.print(", " + current.next.data);
            current = current.next;
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return head == null;
    }

}
