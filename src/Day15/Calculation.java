package Day15;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int number,i,evenSum;
        System.out.print(" Please Enter any Number : ");
        number =scanner.nextInt();

            for(i=1;i<=100;i++){

            System.out.println(number+i);


        }


    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */