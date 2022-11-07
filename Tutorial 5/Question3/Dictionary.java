package Tutorial5.Question3;

public class Dictionary extends Book{
    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
        super(pages);
        this.words = words;
    }
    public String toString() {
        return this.words + ToString();
    }
}
