package lesson.lesson8.assignmentabstractandinterface.onlineshoppingcart;

public interface ShoppingCart {
    void addItem(Item item);

    void removeItem(Item item);

    double calculateTotal();
}
