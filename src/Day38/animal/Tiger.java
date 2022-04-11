package Day38.animal;

import Day38.animal.Animal;

public class Tiger extends Animal {

    public Tiger(String name, String size, String color, int age, char gender) {
        super(name, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name+ "eats deer");
    }
}
