package Day39.animal;

public class Bear extends WildlyAnimal{
    public Bear(String breed, String name, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println("Bear "+getName()+" hunts fish");

    }
}
