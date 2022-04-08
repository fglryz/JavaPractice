package Day36.employee;

public class Developer extends Employee {
    public Developer(double salary) {
        super(salary);
    }

    public void coding() {
        System.out.println(name + " is coding");

    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug");
    }
}