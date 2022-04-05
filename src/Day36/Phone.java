package Day36;

public class Phone {
    public String brand,model,size,color;
    public double price;

    public void setInfo(String brand,String model,String size,double price,String color){
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" is sending message to "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}




