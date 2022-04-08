package Day36.employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("fatma","History Teacher",45,12345,35000);
        System.out.println(teacher);

        Tester tester=new Tester("Naile","SDET lead",54,345234,70000);
        System.out.println(tester);

    }
}
