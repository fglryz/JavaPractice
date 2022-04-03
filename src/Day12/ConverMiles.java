package Day12;

import java.util.Scanner;

public class ConverMiles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles=input.nextDouble();
        System.out.println(miles +"equal to"+miles*1.609344+"kilometers");


    }
}
/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */