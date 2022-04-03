package Day9_1;

import java.util.Scanner;

public class OxygenTank1 {
    public static void main(String[] args) {
        int number ;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please write your level of oxygen:");
        number= scanner.nextInt();
        String note ;

        if (number > 90) {
            note = "Your tank is full";
        } else if (number > 80 && number <= 90) {
            note = "Still okay";
        } else if (number > 70 && number <= 80) {
            note = "Don't go too far";
        } else if (number > 60 && number <= 70) {
            note = "Start to head back";
        } else if (number > 50 && number <= 60) {
            note = "Be careful now you at at 50%";
        } else {
            note = "You are dying man.";
        }

        System.out.println(note);
    }
}


/*
        Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (number) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -  Be careful now you at at 50%
USE ONE PRINT STATEMENT ONLY
         */
