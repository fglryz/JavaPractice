package Day36.employee;

public class Employee {
    public String name,jobTitle;
    public int age,id;
    public double salary;

    public void setInfo(String name, String jobTitle, int age, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
