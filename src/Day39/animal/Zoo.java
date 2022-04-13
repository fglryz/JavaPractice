package Day39.animal;

public class Zoo {
    public static void main(String[] args) {
        FriendlyAnimal friendlyAnimal=new FriendlyAnimal("Hasky","Mike","Large","White",
                5,'F',false,true,true);

        System.out.println(friendlyAnimal);

        Cat cat=new Cat("Tekir","Leo","Medium","Brown",1,'M',false,true,true);
        System.out.println(cat);
    }


}
