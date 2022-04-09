package Day36.book;

public class AudioBook extends Book{
    public String narrator;
    public int length;

    public AudioBook(String title, String type, String author, double price, String narrator, int length) {
        super(title, type, author, price);
        this.narrator = narrator;
        this.length = length;
    }

    public void listen(){
        System.out.println(" listening  to AudiBook");
    }


    public String toString() {
        return "AudioBook{" +
                "narrator='" + narrator + '\'' +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=$" + price +
                '}';
    }
}

