package Day9;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Give tree numbers");
        n1= scan.nextInt();
        n2= scan.nextInt();
        n3= scan.nextInt();


        if(n1==n2 &&n1==n3 ){
            System.out.println( "all equal");

        }
        else if (n1==n2){
            System.out.println("n1 and n2 are  equals");
        }
        else if (n2==n3){
            System.out.println("n2 and n3 are equals");
        }
        else if (n3==n1){
            System.out.println("n3 and n1 are equals");
        }
        else{
            System.out.println("None of them are equal");
        }
    }
}
