package Day36;

public class Iphone extends Phone{
    public Iphone(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Video call "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("Calling "+email);
    }

}
