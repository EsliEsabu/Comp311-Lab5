public class Question8 {
    // takes two books and returns the one with the lower price
    public static Book cheaperBook(Book a, Book b) {
        if (a.getPrice() < b.getPrice()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Book a = new Book("Things Fall Apart", "Chinua Achebe", 120.50);
        Book b = new Book("Head Above Water", "Bessie Head", 95.00);

        Book cheaper = cheaperBook(a, b);
        System.out.println("Cheaper book: " + cheaper.getSummary());
    }
}