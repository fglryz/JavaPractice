package Day39.Student;

public class GraduateStudents extends Student {


    public GraduateStudents(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }



    @Override
    public void study() {
        System.out.println(getName()+" is studying");
    }
}
