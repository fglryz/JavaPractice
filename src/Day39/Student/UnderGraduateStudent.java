package Day39.Student;

public class UnderGraduateStudent extends Student {

    public UnderGraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+" is studying");
    }
}
