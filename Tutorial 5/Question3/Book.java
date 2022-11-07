package Tutorial5.Question3;

public class Book {
    private int pages; // number of pages in the book
    Book(int pages) {
        this.pages = pages;
    }
    public String ToString() {
        return " "+pages; // convert pages to String before returning }
    }
}
