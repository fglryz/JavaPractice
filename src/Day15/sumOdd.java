package Day15;

import java.util.Scanner;

public class sumOdd {
    public static void main(String[] args) {


        int number, i, evenSum = 0;

        for(i = 1; i <= 100; i++)
        {
            if(i % 2 == 1) {
                evenSum +=i;
            }
        }
        System.out.println(evenSum);
    }
}
