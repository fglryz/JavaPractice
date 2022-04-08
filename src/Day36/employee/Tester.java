package Day36.employee;

public class Tester extends Employee{
    public Tester(String naile, String sdet_lead, double salary, int i, int i1) {
        super(salary);
    }

    public void testing(){
        System.out.println(name+" is testing");
    }
    public void creatingTicket(){
        System.out.println(name +"is creating ticket");
    }
}
