package Day9;

import java.util.Scanner;

public class SalaryAfterTax1 {
    public static void main(String[] args) {

        System.out.println("Please enter your salary");

        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        System.out.println("Are you married?(Please write True/False)");
        boolean isMarried = scanner.nextBoolean();

        if(!isMarried){
            if(salary>=130_000){
                salary = salary - salary*0.35;
            }else if(salary>=100_000 && salary <130_000){
                salary = salary - salary*0.3;
            }else if(salary>=80_000 && salary<100_000){
                salary = salary - salary*0.25;
            }else{
                salary = salary- salary*0.2;
            }

        }else{
            if(salary>=130_000){
                salary = salary - salary*0.30;
            }else if(salary>=100_000 && salary <130_000){
                salary = salary - salary*0.25;
            }else if(salary>=80_000 && salary<100_000){
                salary = salary - salary*0.20;
            }else{
                salary = salary- salary*0.15;
            }
        }

        System.out.println("salary = " + salary);

    }
    }

