package Day39.animal;

import Day39.Animal;

public class WildlyAnimal extends Animal {
    private boolean isWild,isFriendly,isPlayable;

    public WildlyAnimal(String breed, String name, String size, String color, int age, char gender,
                        boolean isWild, boolean isFriendly, boolean isPlayable) {
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

public void hunt(){
    System.out.println(getName()+ " is hunting");

}

    public String toString() {
        return "WildlyAnimal{" +
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
3. Create a sub class of Animal named WildAnimal:
Variable:
isWild,
isFriendly, isPlayable
Extra Methods:
hunt()
 */