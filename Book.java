public class Book {
    // Q1 + Q5: private fields (only this class can touch them directly)
    private String title;
    private String author;
    private double price;

    // Q2: constructor - runs when we write new Book(...)
    public Book(String title, String author, double price) {
        this.title = title;     // this.title = field, title = parameter
        this.author = author;
        this.price = price;
    }

    // Q4: gives back all the details as one String
    public String getSummary() {
        return title + " by " + author + " - P" + price;
    }

    // Q5: getters read a field, setters change a field
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}