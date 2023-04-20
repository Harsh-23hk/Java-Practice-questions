package CoreJavaBasic.oops.Abstraction;

public abstract class Book {

    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public abstract void getDetails();
}
