package Day9;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz?");
        num=scan.nextInt();

        if(num==1){
            System.out.println("One");
        }
        else if(num==2){
            System.out.println("Two");
        }
        else if(num==3){
            System.out.println("Three");
        }else if(num==4){
            System.out.println("Four");
        }else if(num==5){
            System.out.println("Five");
        }
        else if(num==6){
            System.out.println("Six");
        }else if(num==7){
            System.out.println("Seven");
        }else if(num==8){
            System.out.println("Eight");
        }else if(num==9){
            System.out.println("Nine");
        }
        else {
            System.out.println("Invalid");
        }


    }
}
/*
Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */