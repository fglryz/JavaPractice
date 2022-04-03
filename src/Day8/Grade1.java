package Day8;

public class Grade1 {
    public static void main(String[] args) {

        byte grade=8;
        if(grade>=1&&grade<=5){
            System.out.println("Elementery school");
        }
        else if (grade>=6&&grade<=8){
            System.out.println("Middle school");
        }
        else if (grade>=9&&grade<=12){
            System.out.println("High school");
        }
        else if (grade>=13&&grade<=16){
            System.out.println("College");
        }
        else if (grade>=7&&grade<=18){
            System.out.println("Grand school");
        }
        else{
            System.out.println("Invalid");
        }
    }

}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */