package Day38.animal;

public class Animal {
    public String name,size,color;
    public int age;
    public char gender;

    public Animal(String name, String size, String color, int age, char gender) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }
    public void eat(){
        System.out.println(name+ "is eating");

    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
Animal Task:
1. Create a class named Animal:
Variables:
name, breed, age, gender, size, color
Add a constructor to set all the fields
methods:
eat()
toString()
2. Create the followin sub classes of Animal and override the eat
method:
1. Cat
eat(): eats cat food
2. Dog
eat(): eats dog food
3. Tiger
eat(): eats deer
4. Eagle
eat(): eats snake
Employee Task:
1. Create a class named Employee
Variables:
name, age, gender, id, jobTitle,
salaryName, comapnyName
Add a constructor to set all the fields
Methods:
work()
toString()
2. Create ethe following subclasses and override the work method in
each subclass:
 */