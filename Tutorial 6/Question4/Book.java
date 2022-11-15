package Tutorial6.Question4;

public class Book {
    String title, author;
    double price = 1199.0;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Name of the Author: " + this.author + "\nBook Title:  " + this.title + "\nPublication Year: " + this.year + "\nPrice: " + this.price;
    }
}
