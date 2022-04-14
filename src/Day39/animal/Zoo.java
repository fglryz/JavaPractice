package Day39.animal;

public class Zoo {
    public static void main(String[] args) {
        FriendlyAnimal friendlyAnimal=new FriendlyAnimal("Hasky","Mike","Large","White",
                5,'F',false,true,true);

        Cat cat=new Cat("Tekir","Leo","Medium","Brown",1,'M',
                false,true,true);
        Dog dog=new Dog("Hasky","Leo","small","Grey",3,'M',false,
                true,true);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(friendlyAnimal);
        System.out.println("-----------------------------------");

        dog.eat();
        dog.setName("Max");
        dog.drink();
        dog.setGender('F');
        System.out.println(dog);
    }


}
