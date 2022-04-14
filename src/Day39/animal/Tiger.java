package Day39.animal;

public class Tiger  extends  WildlyAnimal{
    public Tiger(String breed, String name, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println("Tiger "+getName()+" hunts deer");
    }
}
