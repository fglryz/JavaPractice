package Day9;

import java.util.Scanner;

public class FinRA1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        boolean fin = number > 0 && number % 3 == 0 && number % 5 != 0,
                ra = number > 0 && number % 5 == 0 && number % 3 !=0,
                finRa =number > 0 && number % 15 == 0;

        if(fin){
            System.out.println("FIN");
        }else if(ra){
            System.out.println("RA");
        }else if(finRa){
            System.out.println("FINRA");
        }else{
            System.out.println("Invalid number for Finra, please try a different number");
        }

    }
}
