package Day13;

import java.util.Scanner;

public class FirstLastCharSAme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please write a sentence");
        String stc=input.nextLine();
        input.close();
        char first=stc.charAt(0);
        char last=stc.charAt(stc.length()-1);

       String result="";
       result=(first==last)? "same":"not same";

        System.out.println(result);


    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */
