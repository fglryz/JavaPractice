package Day39.Device;

public class Iphone extends Phone {


    public Iphone(String brand, String model, double price) {
        super(brand, model, price);
    }


    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+ " " + getModel() + " " + " is having a Face Time with phone number: " + phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println(getBrand() + " " + getModel() + " is having a Face Time with email: " + email);

    }
    }

/*
5. Create the following sub classes of Phone and add any extra
methods that are needed:
1. Iphone
2. Samsung
3. BlackBerry
4. Google
5. Nokia
 */



