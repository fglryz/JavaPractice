package Day9;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your grade number");
        gradeNumber= scan.nextInt();

        if (gradeNumber==1){
            System.out.println("location -  Apple orchard\n" +
                    "number of groups - 3\n" +
                    "teacher in charge - Ms. Smith");
        }
        else if(gradeNumber==2){
            System.out.println("location - Zoo\n" +
                    "number of groups - 7\n" +
                    "teacher in charge - Mr. Lee\n");

        }
        else if(gradeNumber==3){
            System.out.println("location - Aquarium\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Wilson");

        }else if(gradeNumber==4){
            System.out.println("else if(gradeNumber==3){\n" +
                    "            System.out.println ");

        }else if(gradeNumber==5){
            System.out.println("location - Museum\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Lela");

    }
        else if(gradeNumber==6){
            System.out.println("location - Six Flags\n" +
                    "number of groups - 8\n" +
                    "teacher in charge - Mr. Watt");

        }
        else{
            System.out.println("Invalid action");
        }

    }
}
