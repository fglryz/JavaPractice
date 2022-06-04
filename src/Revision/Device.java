package Revision;

public class Device {

    private String brand, model;
    private double price;
    private static boolean hasBattery = true, hasPowerButton = true;

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null||brand.isBlank()||brand.isBlank()){
           throw new RuntimeException();
            //System.out.println("Invalid brand");
           // System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null||model.isBlank()||model.isBlank()){
            throw new RuntimeException();
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){throw new RuntimeException();}
        this.price = price;
    }


    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                '}';
    }
}












/*
1. Create a class named Device:
Variables:brand, model, price,hasBattery, hasPowerButton
Encapsulate all the fields
Add a constructor to set all the fields
Condition:
1. brand,model can not be null (if obj == null means it's error)
2. brand,model can not be empty or can not be blank
3. pricecan not be set to negative or zero
Methods:
turnOn(), turnOff(), toString()

 */

   /*  private String brand, model;
    private double price;
    private static boolean hasBattery = true, hasPowerButton = true;

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null||brand.isBlank()||brand.isBlank()){
        throw new RuntimeException();
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null||model.isBlank()||model.isBlank()){
            throw new RuntimeException();
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException();

        }
        this.price = price;
    }
    public void turnOn(){
        System.out.println("Turning on "+brand+" "+model);
    }
    public void turnOff(){
        System.out.println("Turning off "+brand+" "+model);
    }


    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                '}';
    }*/


