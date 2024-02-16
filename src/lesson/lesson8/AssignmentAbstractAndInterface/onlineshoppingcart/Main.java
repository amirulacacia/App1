package lesson.lesson8.assignmentabstractandinterface.onlineshoppingcart;

public class Main {
    public static void main(String[] args) {
        Item banana = new Item(3);
        Item apple = new Item(10);
        Item mango = new Item(5);
        Item grape = new Item(20);
        Item orange = new Item(7);
        InStoreShoppingCart inStoreShoppingCart = new InStoreShoppingCart();
        inStoreShoppingCart.addItem(banana);
        inStoreShoppingCart.addItem(orange);
        inStoreShoppingCart.addItem(grape);
        inStoreShoppingCart.addItem(mango);
        inStoreShoppingCart.addItem(apple);

        System.out.println("Total price: RM " + inStoreShoppingCart.calculateTotal());

        OnlineShoppingCart onlineShoppingCart = new OnlineShoppingCart();
        onlineShoppingCart.addItem(banana);
        onlineShoppingCart.addItem(orange);
        onlineShoppingCart.addItem(grape);
        onlineShoppingCart.addItem(mango);
        onlineShoppingCart.addItem(apple);
        onlineShoppingCart.removeItem(grape);

        System.out.println("Total price: RM " + onlineShoppingCart.calculateTotal());
    }
}
