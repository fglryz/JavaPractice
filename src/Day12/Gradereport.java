package Day12;

import java.util.Scanner;

public class Gradereport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your score:");
        int score= input.nextInt();
        String result="";

        if (score>=90){
            //System.out.println("A");
             result= "A";
        }else if (score>=80 && score<90){
            //System.out.println("B");
            result= "B";
        }else if (score>= 70 && score<80){
            //System.out.println("C");
            result= "C";
        }else if (score>=60 && score<70){
            //System.out.println("D");
            result = "D";
        }else{
            //System.out.println("F");
            result = "F";
        }
        System.out.println(result);

    }
}

/*
GradeReport:
2.1 Ask the user to enter the his/her score
2.2 Print the grade of the student (A, B, C, D, F)
2.3 If user enter invalid score (negative or more than 100)
print invalid score
 */
