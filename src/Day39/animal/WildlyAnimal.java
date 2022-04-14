package Day39.animal;

public class WildlyAnimal extends Animal {
    private static boolean isWild=true,isFriendly=false,isPlayable=false;

    public WildlyAnimal(String breed, String name, String size, String color, int age, char gender,
                        boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender);

    }



public void hunt(){
    System.out.println(getName()+ " is hunting");

}



    }

/*
3. Create a sub class of Animal named WildAnimal:
Variable:
isWild,
isFriendly, isPlayable
Extra Methods:
hunt()
 */