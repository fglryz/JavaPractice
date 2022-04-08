package Day36.book;

public class EBook extends Book{
    public String size;
    public int page;

    public EBook(String title, String type, String author, double price, String size, int page) {
        super(title, type, author, price);
        this.size = size;
        this.page = page;
    }
    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", page=" + page +
                '}';
    }
    public void readBook(){

    }
}
