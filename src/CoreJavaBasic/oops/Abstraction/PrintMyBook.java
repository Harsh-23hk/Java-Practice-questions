package CoreJavaBasic.oops.Abstraction;

public class PrintMyBook extends Book {


    public PrintMyBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void getDetails() {
        System.out.println("Title:" + this.title + "  Author:" + this.author + "  Price:" + this.price);
    }

    public static void main(String[] args) {
        Book book = new PrintMyBook("Java", "John", 100); //dynamic  dispatch
        book.getDetails();
    }
}
