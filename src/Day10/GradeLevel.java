package Day10;

public class GradeLevel {
    public static void main(String[] args) {


        byte grade=9;

        if(grade>=1&&grade<=18){
            if(grade>=1&&grade<=5 ){
                System.out.println("Elementry school");
            }
            else if(grade>=6&&grade<=8 ){
                System.out.println("Middle school");
            }
           else  if (grade>=9&&grade<=12 ){
                System.out.println("High school");
            }
            else if(grade>=13&&grade<=16 ){
                System.out.println("College");
            }
            else {
                System.out.println("Grand School");
            }

    }

        else{
            System.out.println("Invalid grade given");
        }


        System.out.println("**********************************");

        byte grade1=9;
         String level="";
        if(grade1>=1&&grade1<=18){
            if(grade>=1&&grade<=5 ){
                level="Elementry school";
            }
            else if(grade1>=6&&grade1<=8 ){
                level="Middle school";
            }
            else  if (grade1>=9&&grade1<=12 ){
                level="High school";
            }
            else if(grade1>=13&&grade1<=16 ){
                System.out.println("College");
            }
            else {
                level="Grand School";
            }
            System.out.println("Level="+level);

        }

        else{
            System.out.println("Invalid grade given");
        }





    }}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */