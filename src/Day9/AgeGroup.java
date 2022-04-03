package Day9;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        int ageGroup;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write your age ");
        ageGroup= scan.nextInt();

        if(ageGroup>=1 && ageGroup <=2)
        {
            System.out.println("Infant");
    }
        else if(ageGroup >=3 && ageGroup<6 ) {
            System.out.println("Toodler");
        }
        else if(ageGroup >=6 && ageGroup<10 ) {
            System.out.println("Kid");
        }
        else if(ageGroup >=10 && ageGroup<13 ) {
            System.out.println("Pre-Ten");
        }
        else if(ageGroup >=13 && ageGroup<18 ) {
            System.out.println("Teenager");
        }
        else if(ageGroup >=18 && ageGroup<21 ) {
            System.out.println("Young Adult");
        }
        else if(ageGroup >=21 && ageGroup<40 ) {
            System.out.println("Adult");
        }
        else if(ageGroup >=40 && ageGroup<50 ) {
            System.out.println("Young Middle-Aged Adult");
        }
        else if(ageGroup >=50 && ageGroup<55 ) {
            System.out.println(" Middle-Aged Adult");
        }

        else if(ageGroup >=55 && ageGroup<65 ) {
            System.out.println(" Very Young Senior Citizen");
        }
        else if(ageGroup >=65 ||ageGroup<75 ) {
            System.out.println("  Young Senior Citizen");
        }
        else if(ageGroup >=75 && ageGroup<85 ) {
            System.out.println("  Senior Citizen");
        }
        else{
            System.out.println("Old senior Citizen");
        }



}}
