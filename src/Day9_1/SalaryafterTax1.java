package Day9_1;

import java.util.Scanner;

public class SalaryafterTax1 {
    public static void main(String[] args) {

        double salary;
        boolean isMarried;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your salary:");
        salary= scanner.nextDouble();
        System.out.println("Are you married?(please write True or False)");
        isMarried= scanner.nextBoolean();


            if(salary>=130000&& !isMarried){
                System.out.println(salary-salary*35/100);
        }
        else if(salary<=100000&& salary<130000&& !isMarried){
                System.out.println(salary-salary*30/100);
        }
        else if(salary<=80000&& salary<100000&&!isMarried){
                System.out.println(salary-salary*25/100);}
        else if (salary>=80000&&!isMarried){
                    System.out.println(salary-salary*20/100);
        }
        if(salary>=130000&& !isMarried){
            System.out.println(salary-salary*35/100);
        }
        else if(salary<=100000&& salary<130000&& isMarried){
            System.out.println(salary-salary*30/100);
        }
        else if(salary<=80000&& salary<100000&&isMarried){
            System.out.println(salary-salary*25/100);
        }
        else if (salary>=80000&&isMarried){
            System.out.println(salary-salary*20/100);
        }

        System.out.println("Salary: " + salary);
            }


        }

/*
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax

 */
