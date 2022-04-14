package Day39.animal;

public class Animal {private String breed, name, size, color;
    private int age;
    private char gender;

    public Animal(String breed, String name, String size, String color, int age, char gender) {
        setBreed(breed);
        setName(name);
        setSize(size);
        setColor(color);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null||name.isBlank()||name.isEmpty()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null||color.isBlank()||color.isEmpty()) {
            System.err.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M')&&(!(gender=='F'))){
            System.err.println("it is invalid gender");

        System.exit(1);}

        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null) {
            System.err.println("Invalid breed");
            System.exit(1);
        }
        if (breed.isBlank()) {
            System.err.println("Invalid breed");
            System.exit(1);

        }
        if (breed.isEmpty()) {
            System.err.println("Invalid breed");
            System.exit(1);

        }
        this.breed = breed;
    }
    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void drink(){
        System.out.println(name+ " is drinking");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public void move(){
        System.out.println(name+ " is moving");
    }

    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Animal:
variables:
name, breed, gender, age, size, color
Encapsulate all the fields
Add a constructor to set all the fields
Conditions:
1. name, breed
and color can not be null (if obj == null means it's error)
2. name, breed
and color can not be empty or can not be blank
3. gender should
only be set to either 'M' or 'F'
4. age can not be
set to negative
Methods:
eat()
drink()
sleep()
move()
toString()
 */

