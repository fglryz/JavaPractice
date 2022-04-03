package Day17;

import java.util.Locale;
import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter your name:");
        String name= scanner.nextLine();

        System.out.println("enter your age:");
        int age= scanner.nextInt();

        while(!(age>0&&age<=120)){
            System.out.println("Invalid,please re =enter again");
            age= scanner.nextInt();
        }

        System.out.println("enter your gender:");
        String gender= scanner.next().toLowerCase();
        while(!(gender.equals("male")||gender.equals("female"))){
            System.out.println("Invalid,please re =enter again");
            gender= scanner.next().toLowerCase();

        }
        System.out.println("Are you married?:");
        String isMarried=scanner.next().toLowerCase();

        while (!(isMarried.equals("yes")||isMarried.equals("no"))){
            System.out.println("Invalid,please re =enter again");
            isMarried=scanner.next().toLowerCase();
        }

        System.out.println("How many mileages do you drive in a day");
        int mileages=scanner.nextInt();
        while(mileages<5){
            System.out.println("Invalid,please re =enter again");
            mileages=scanner.nextInt();
        }
       scanner.nextLine();

        System.out.println("Would  you want to full coverage or liability insurance?full coverage/liability " );
        String insurance=scanner.nextLine().toLowerCase();
        while(!(insurance.equals("liability")||insurance.equals("full coverage"))){
            System.out.println("Invalid,please re =enter again");
            insurance=scanner.nextLine().toLowerCase();
        }

        System.out.println("Have  you had any accident in the past 5 year? (yes or no) ");
           String accident=scanner.next().toLowerCase();
        while(!(accident.equals("yes")||accident.equals("no"))) {
            System.out.println("Invalid,please re =enter again");
            accident = scanner.next().toLowerCase();
        }

        System.out.println("Are your car anti-theft car?(yes/no)");
        String antiTeft=scanner.next().toLowerCase();
        while(!(antiTeft.equals("yes")||antiTeft.equals("no"))){

            System.out.println("Invalid,please re =enter again");
            antiTeft = scanner.next().toLowerCase();
        }
        double price=0;

        if(insurance.equals("yes")){
            if(age>25){
                price+=90;

            }
            else{
                price+=50;
            }
            if (mileages > 50) {

                price+=50;
            }
            else if(mileages>10){
                price+=30;
            }
            else{

            }price+=10;
        }
        else{
            if(age<25){
                price+=160;

            }
            else{
                price+=120;
            }
            if(mileages>50){
                price+=70;
            }
            else if(mileages>10){
                price+=40;
            }
            else{
                price+=20;
            }}
            double discounRate=0;

            if(antiTeft.equals("yes")){
                discounRate+=0.05;
            }
            if(accident.equals("yes")){
                discounRate-=0.15;
            }
            else{
                discounRate+=0.1;
            }
            if(accident.equals("no")){
                discounRate-=0.10;
            }
            if(isMarried.equals("yes")){
                discounRate+=0.05;

            }
            double totalPrice=price*(1-discounRate);
            System.out.println("name = " + name);
            System.out.println("age = " + age);
            System.out.println("gender = " + gender);
            System.out.println("isMarried = " + isMarried);
            System.out.println("mileages = " + mileages);
            System.out.println("liability = " + insurance);
            System.out.println("accident = " + accident);
            System.out.println("antiTeft = " + antiTeft);
            System.out.println("totalPrice = " + totalPrice);
scanner.close();
        }


    }

/*
6. Create a class called InsuranceQuote, write a program that can
calculate the insurance cost of a person based on the following info:
1. Ask the user to enter your name
2. Ask the user to enter your gender
(if user enters invalid entry, ask the user
to re-enter until user provides a valid entry)
3. Ask the user if he/she is married(Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
4. Ask user to enter your age
(age can not be negative or
greater than 120)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
5. Ask user to enter how many miles he/she
drives in a day
(mileage can not be negative
or less than 5)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
6. Ask the user if he/she wants full coverage
or liability insurance?
7. Ask if he/she had any accidents or claims
in past 5 years (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
8. Ask the user if his/her car has an anti-
theft device (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
Calculate the price of the insurance and display all the
info of the user
Insurance Quote calculation:
starting prices for liability:
age < 25 ===> 90
age >= 25 ==> 50
miles <= 10 ====> $10
    miles > 10 and miles <= 50 ==>
$30
    miles > 50 ===>  $50
starting prices for full coverage:
age < 25 ===> 160
age >= 25 ==> 120
miles <= 10 ====> $20
    miles > 10 and miles <= 50 ==>
$40
    miles > 50 ===>  $70
    If the car has anti-theft device ==> 5%
discount
    If he/she had any accidents or claims in
past 5 years ===> 15% extra charge
    If he/she never had any accidents or
claims in past 5 years ==> 10% discount
    If he/she is married ==> 5% discount
 */