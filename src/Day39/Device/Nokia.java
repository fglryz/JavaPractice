package Day39.Device;

public class Nokia extends Phone{

    public Nokia(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void selfDefense(){
        System.out.println("You can use "+getBrand()+" "+getModel()+" as self defense tool");
    }
}

