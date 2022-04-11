package Day39.animal;

public class Dolphin extends FriendlyAnimal{


    public Dolphin(String breed, String name, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    public void swom(){
        System.out.println(getName()+ " is swimming");
    }
}
/*
olphin:
        Extra methods:
        swim()
public void scratch(){
        System.out.println(getName()+ "is scratching");
    }
 */