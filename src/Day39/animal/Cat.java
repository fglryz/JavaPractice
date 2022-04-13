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
}

    /*2. Cat:
    Extra methods:
    scratch()
    meow()*/

