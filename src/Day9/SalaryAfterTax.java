package Day9;

import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 130000;
        double taxRate = 0;
        boolean isMarried = false;


        if(salary>=130000 ){
            taxRate=0.35; ;

        }else if(salary >=100000){
            taxRate=0.30;
        }else if(salary >=80000) {
            taxRate=0.25;
        }
            else{
                taxRate=0.20;
            }
            if(isMarried){//if the person is married
                taxRate-=0.05;
            }
            double salaryAfterTax=salary-salary*taxRate;
            System.out.println("salary After Tax is= " + salaryAfterTax);
        }

    }



/*
Write a program that can calculate the salary after tax based on the
following requirements
the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k
(excluded)
25% for salary of 80K to 100K
(excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5%
less tax

 */