package Day36.book;

public class EBook extends Book{
    public String size;
    public int page;

    public EBook(String size, int page) {
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
