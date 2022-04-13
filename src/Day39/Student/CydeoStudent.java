package Day39.Student;

public class CydeoStudent extends Student {

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade,
                        String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, "Cydeo");
        setBatchNumber( batchNumber);
        setGroupNumber(8);
        setProgrammingLanguage( "Java");
    }



    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Invalid batchNumber: "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.err.println("Invalid groupNumber: "+groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (null==programmingLanguage||programmingLanguage.isEmpty()){
            System.err.println("Invalid programmingLanguage: "+programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }


    public void study(){
        System.out.println(getName()+" is studying java, agile-scrum...");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is thinking "+programmingLanguage +" while "+getName()+" is eating");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is thinking "+programmingLanguage +" while "+getName()+" is drinking");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is dream of "+programmingLanguage +" while "+getName()+" is sleeping");

    }










    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}



