package Day39.Student;

public class StudentObject {
    public static void main(String[] args) {


    Person person=new Person("Fatma",45,'F');

   Student student=new Student("Alina",32,'F',1234,
           "SDET",'A',"Cydeo");

   CydeoStudent cydeoStudent=new CydeoStudent("Alex",24,'M',3245,
           "Java Developer",'A',"Cydeo",
           8,11,"Java");

        System.out.println(person);
        System.out.println(student);
        System.out.println(cydeoStudent);

        System.out.println("==========================");
        cydeoStudent.study();
        cydeoStudent.eat();
        cydeoStudent.setGroupNumber(25);
        cydeoStudent.setProgrammingLanguage("Python");
        cydeoStudent.setBatchNumber(11);
        System.out.println(cydeoStudent);
        System.out.println("==========================");
        person.drink();








}}
