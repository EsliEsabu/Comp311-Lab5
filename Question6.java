public class Question6 {
    public static void main(String[] args) {
        // an array with room for 3 books
        Book[] books = new Book[3];
        books[0] = new Book("Things Fall Apart", "Chinua Achebe", 120.50);
        books[1] = new Book("Head Above Water", "Bessie Head", 95.00);
        books[2] = new Book("Weep Not, Child", "Ngugi wa Thiong'o", 110.00);

        // loop through the array and print each summary
        for (Book book : books) {
            System.out.println(book.getSummary());
        }
    }
}