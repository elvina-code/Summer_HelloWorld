package oop.BookStore;

public class BookStore {
    private String title;
    private Author author;
    private double price;

    public BookStore(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
}
