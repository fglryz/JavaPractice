package Day33;

public class Iphone {
    public String model,color , size;
    public double prize;

    public static String brand="Apple";
    public static String OS="IOS";
    public static String madeIn="China";

    public Iphone(String model, String color, String size, double prize) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.prize = prize;
    }
    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with  number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model+" is face timing with email "+email);
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", prize=" + prize +
                '}';
    }
}
/*
IPhone Task:
1. Creta a class named IPhone:
Attributes:
instance: model, price,
color, size
statics: brand, OS, madeIn
Add a constructor that can set All the
fields (instances)
Actions:
faceTime(long phoneNumber)
faceTime(String email)
call(long phoneNumber)
text(long phoneNumber)
toString()
 */