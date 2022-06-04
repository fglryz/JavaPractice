package Day39.animal;

public class FriendlyAnimal  extends Animal {
    private static boolean isWild=false, isFriendly=true,isPlayable=true;

    public FriendlyAnimal(String breed, String name, String size, String color, int age, char gender, boolean isWild,
                          boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender);

    }


    public void play(){
        System.out.println(getName()+" is playing" );

    }
    public void pet(){
        System.out.println(getName()+" is being pet" );

    }



    }

/*
2. Create a sub class of Animal named FriendlyAnimal:
Variable:
isWild
isFriendly
isPlayable
Extra methods:
play()
pet()
 */