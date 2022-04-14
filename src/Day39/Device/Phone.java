package Day39.Device;

public class Phone extends Device {


    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }


    public void call(long phoneNumber){
        System.out.println("It is calling");

    }
    public void text(long phoneNumber){
        System.out.println("It is texting");

    }



}
/*
2. Create a subclass of Device named Phone:
Extra Methods:
call(long
phoneNum), text(long phoneNum)
 */