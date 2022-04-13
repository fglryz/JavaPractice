package Day39.Student;

public class Student extends Person {
    private int studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy,
                   char grade, String schoolName) {
        super(name, age, gender);
      setStudentId( studentId);
        setFieldOfStudy( fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(null==fieldOfStudy||fieldOfStudy.isEmpty()){
            System.out.println("Invalid filed "+fieldOfStudy);
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }

        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(null==schoolName||schoolName.isEmpty()){
            System.out.println("Invalid SchoolName"+ schoolName);
            System.exit(1);
        }
        this.schoolName = schoolName;
    }
    public void study(){
        System.out.println(getName()+" is studying ");
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
