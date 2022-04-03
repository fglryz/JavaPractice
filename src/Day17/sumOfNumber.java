package Day17;

import java.util.Scanner;

public class sumOfNumber {
    public static void main(String[] args) {

while (true){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
         int num1=scanner.nextInt();

        System.out.println("Enter second number");
        int num2=scanner.nextInt();

        if(num1>=0&&num2>=0){

            System.out.println(num1+num2);


    }

        if(!(num1>=0&&num2>=0)){
            break;
}


scanner.close();

    }}}
/*
2. Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop
 */