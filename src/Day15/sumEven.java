package Day15;

import java.util.Scanner;

public class sumEven {
    public static void main(String[] args) {

        int Sum = 0;


        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                Sum +=i;
            }
        }
        System.out.println( Sum);
    }
    }





/*
1. Write a program that can return the sum of even numbers between 1 to 100

 */