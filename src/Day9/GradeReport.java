package Day9;

public class GradeReport {
    public static void main(String[] args) {

        //Grade Report task
        //garde report ==> A, B, C, D, F
            int score= 90;
            String note;


            if (score>=90){
                //System.out.println("A");
                note = "A";
            }else if (score>=80 && score<90){
                //System.out.println("B");
                note = "B";
            }else if (score>= 70 && score<80){
                //System.out.println("C");
                note = "C";
            }else if (score>=60 && score<70){
                //System.out.println("D");
                note = "D";
            }else{
                //System.out.println("F");
                note = "F";
            }
            System.out.println(note);
        }
    }


