public class Question3 {
    public static void main(String[] args) {
        // create two Book objects
        Book b1 = new Book("Things Fall Apart", "Chinua Achebe", 120.50);
        Book b2 = new Book("Head Above Water", "Bessie Head", 95.00);

        // use getters to print the private fields
        System.out.println(b1.getTitle() + ", " + b1.getAuthor() + ", " + b1.getPrice());
        System.out.println(b2.getTitle() + ", " + b2.getAuthor() + ", " + b2.getPrice());
    }
}