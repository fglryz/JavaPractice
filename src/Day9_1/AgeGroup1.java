package Day9_1;

import java.util.Scanner;

public class AgeGroup1 {
    public static void main(String[] args) {

        int age;
        System.out.println("Give me a number:");
        Scanner scanner=new Scanner(System.in);
         age= scanner.nextInt();


         if(age>=1&&age<=2){
            System.out.println("Infant");
        }
        else if( age<=3&&age>=5){
            System.out.println("Toddler");
    }

        else if(age >=6 && age<10 ) {
            System.out.println("Kid");
        }
        else if(age >=10 && age<13 ) {
            System.out.println("Pre-Ten");
        }
        else if(age >=13 && age<18 ) {
            System.out.println("Teenager");
        }
        else if(age>=18 && age<21 ) {
            System.out.println("Young Adult");
        }
        else if(age >=21 && age<40 ) {
            System.out.println("Adult");
        }
        else if(age>=40 && age<50 ) {
            System.out.println("Young Middle-Aged Adult");
        }
        else if(age>=50 && age<55 ) {
            System.out.println(" Middle-Aged Adult");
        }

        else if(age >=55 && age<65 ) {
            System.out.println(" Very Young Senior Citizen");
        }
        else if(age >=65 ||age<75 ) {
            System.out.println("  Young Senior Citizen");
        }
        else if(age >=75 && age<85 ) {
            System.out.println("  Senior Citizen");
        }
        else{
            System.out.println("Old senior Citizen");
        }



    }}
/*
5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */