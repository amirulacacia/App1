package quiz1.question1;

public class Book {
    private String name;
    private String author;

    Book(){}

    Book(String name, String author) {
        //Correction:
        //name = name;
        //author = author;
        //Answer:
        this.name = name;
        this.author = author;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }
}
