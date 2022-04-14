package Day39.Device;

import java.util.concurrent.Callable;

public class MyDevices {
    public static void main(String[] args) {

       Computer computer=new Computer("Asus","M12",1200,true,true);
       Phone phone=new Phone("Apple","Iphone12",600,true,false);
       Samsung samsung=new Samsung("SX1",550,true,true);
       Google google=new Google("Google","G67",450,false,true);
        System.out.println(computer);
        System.out.println(phone);
        System.out.println(samsung);
        System.out.println(google);

        System.out.println("---------------------------------------");
        phone.call(3452678);
        phone.setHasBattery(false);
        samsung.freeze();
        samsung.setPrice(340);
    }
}
