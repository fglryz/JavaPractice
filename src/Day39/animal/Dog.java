package Day39.animal;

public class Dog extends FriendlyAnimal{

    public Dog(String breed, String name, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }
    public void bark() {
        System.out.println(getName()+" is barking");
    }


}


/*
4. Create the following sub classes of FriendlyAnimal and Override
the eat method
1. Dog:
Extra methods:
bark()
2. Cat:
Extra methods:
scratch()
meow()
3. Dolphin:
Extra methods:
swim()
4. Parrot:
Extra methods:
fly()
sing()
 */