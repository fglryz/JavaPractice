package Day9_1;

import java.util.Scanner;

public class CampusTime1 {
    public static void main(String[] args) {
        double time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it?:");
        time = scanner.nextInt();

        if (time >= 8 && time <= 23)
        {
            System.out.println("Open");

        }
      else{
            System.out.println("Closed");
        }
    }}
/*
Create a class called CampusTime, an integer variable named time is given with
a number between 1~24 has been initialized,
write a program that can find out if the campus is open or not.
Campus is open from 8 am(8) to 11 pm (23)
If user enters a time within the open time they should see message: “open”  but
 if the time entered is outside of operating hours they should see: “ closed”



 */
