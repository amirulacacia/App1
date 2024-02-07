package quiz.quiz1.question1;

public class TextBook {
    public static void main(String[] args) {
        //Below cannot be done because the book parameter 
        //cannot be reach because of the private
        //Correction:
        //private Book book = new Book("Head First Java","Kathy Sierra");
        //Answer:
        Book book = new Book("Head First Java","Kathy Sierra");

        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
