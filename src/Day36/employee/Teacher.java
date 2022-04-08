package Day36.employee;

public class Teacher extends Employee{

    public Teacher(String fatma, String history_teacher, double salary, int i, int i1) {
        super(salary);
    }

    public void teaching(){
        System.out.println(name+" is teaching");
    }
}
