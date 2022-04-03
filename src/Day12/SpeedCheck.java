package Day12;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Your current speed:");
        int currentSpeed=input.nextInt();
        System.out.println("Speed limit:");
        int speedLimit=input.nextInt();

        if( currentSpeed >50){
            System.out.println("You're driving 50 mph over the limit. Slow down!");
        }


    }
}
/*
Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */