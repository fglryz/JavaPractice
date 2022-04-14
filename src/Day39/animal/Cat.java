package Day39.animal;

public class Cat extends FriendlyAnimal {

    public Cat(String breed, String name, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender, isWild, isFriendly, isPlayable);
    }
    public void scratch(){
        System.out.println(getName()+ "is scratching");
    }
    public void meow(){
        System.out.println(getName()+ "is meoving");
    }


    }


    /*2. Cat:
    Extra methods:
    scratch()
    meow()*/

