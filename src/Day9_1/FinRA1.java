package Day9_1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class FinRA1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Please enter a number: ");
        number= scanner.nextInt();


        if(number > 0 && number % 3 == 0 && number % 5 != 0){
            System.out.println("FIN");
        }
        else if(number > 0 && number % 5 == 0 && number % 3 !=0 ){
            System.out.println("RA");
        }
        else if(number > 0 && number % 15 == 0){
            System.out.println("FINRA");
        }
        else {
            System.out.println("Invalid");
        }


    }
}
/*
Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3,
print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number.
and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */
