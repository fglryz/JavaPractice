package Day12;

import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Your cents:");
        double cent = input.nextDouble();

        double dollar;
        System.out.println(cent/100 +" $ and "+cent%100 + "cent");

        input.close();


    }
}
/*
Write a program that can convert cents to dollars, if there is
any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */