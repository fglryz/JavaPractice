package Day17;

public class DivideTwoNumber {
    public static void main(String[] args) {
        int num1=34;
        int num2=5;
        int count=0;

        while(num1>num2){
            num1-=num2;
            count++;


        }
        System.out.println(count+ " with remainder "+ num1);

    }
}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */