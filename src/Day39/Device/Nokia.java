package Day39.Device;

public class Nokia extends Phone{
    public Nokia(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void selfDefense(){
        System.out.println("You can use "+getBrand()+" "+getModel()+" as self defense tool");
    }
}

