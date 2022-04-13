package Day39.Student;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null == name || name.isEmpty()) {
            System.err.println("Invalid name " + name);
            System.exit(1);

        }
        char[] chars = name.toCharArray();
        for (char each : chars) {
            if ((!(Character.isLetterOrDigit(each))) || each == ' ') {
                System.err.println("Invalid name " + name);
                System.exit(1);

            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Invalid age" + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || (gender == 'M'))) {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
