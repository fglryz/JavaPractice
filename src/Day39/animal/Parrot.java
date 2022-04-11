package Day39.animal;

public class Parrot extends FriendlyAnimal{
    public Parrot(String breed, String name, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender, isWild, isFriendly, isPlayable);
    }
    public void fly(){
        System.out.println(getName()+ "is flying");
    }
    public void sing(){
        System.out.println(getName()+ "is singing");
    }
}
/*
4. Parrot:
Extra methods:
fly()
sing()
 */