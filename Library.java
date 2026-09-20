import java.util.ArrayList;

public class Library {
    // a list that can only hold Book objects
    private ArrayList<Book> books = new ArrayList<>();

    // add one book to the list
    public void addBook(Book b) {
        books.add(b);
    }

    // print every book in the list
    public void printAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getSummary());
        }
    }
}