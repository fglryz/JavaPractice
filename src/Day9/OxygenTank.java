package Day9;

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {



    Scanner scan=new Scanner(System.in);
     int tank;
        System.out.println("Please give me level of you tank");
        tank = scan.nextInt();


    if (tank>90){
        System.out.println("Above 90 -  Your tank is full");
    }
    else if(tank>80 && tank<=90){
        System.out.println("Above 80 -  Still okay");
    }
    else if(tank>70 && tank<=80) {
        System.out.println("Above 70 -Don't go too far  ");
    }
        else if(tank>60 && tank<=70) {
        System.out.println("Start to head back");
    }
            else if (tank > 50 && tank <= 60) {
                System.out.println("Be careful now you at at 50%");

            }
            else{
        System.out.println("Be careful");
    }

        }}

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
