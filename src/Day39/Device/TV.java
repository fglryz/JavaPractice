package Day39.Device;

public class TV  extends Device{
    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void channelUp(){
        System.out.println("Channel is increasing");
    }
    public void channelDown(){
        System.out.println("Channel is decreasing");
    }
}
/*
4. Create a sub class of Device named TV:
Extra Methods:
channelUp()
channelDown()
 */