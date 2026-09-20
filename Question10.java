public class Question10 {
    public static void main(String[] args) {
        Library lib = new Library(); // empty library

        // add four books
        lib.addBook(new Book("Things Fall Apart", "Chinua Achebe", 120.50));
        lib.addBook(new Book("Head Above Water", "Bessie Head", 95.00));
        lib.addBook(new Book("Weep Not, Child", "Ngugi wa Thiong'o", 110.00));
        lib.addBook(new Book("Nervous Conditions", "Tsitsi Dangarembga", 130.00));

        lib.printAllBooks(); // show them all
    }

    private static class Library {
        private final java.util.List<Book> books = new java.util.ArrayList<>();

        void addBook(Book book) {
            books.add(book);
        }

        void printAllBooks() {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private static class Book {
        private final String title;
        private final String author;
        private final double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("%s by %s - %.2f", title, author, price);
        }
    }
}