package Day36;

public class Iphone extends Phone{
    public void faceTime(long phoneNumber){
        System.out.println("Video call "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("Calling "+email);
    }

}
