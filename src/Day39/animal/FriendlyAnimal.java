package Day39.animal;

public class FriendlyAnimal  extends Animal {
    private boolean isWild,isFriendly,isPlayable;

    public FriendlyAnimal(String breed, String name, String size, String color, int age, char gender, boolean isWild,
                          boolean isFriendly, boolean isPlayable) {
        super(breed, name, size, color, age, gender);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }
    public void play(){
        System.out.println(getName()+" is playing" );

    }
    public void pet(){
        System.out.println(getName()+" is petting" );

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void move() {
        super.move();
    }

    public String toString() {
        return "FriendlyAnimal{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
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