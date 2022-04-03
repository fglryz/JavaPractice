package Day14;

import java.util.Scanner;

public class TwoWorsdAdd_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first word");
         String word1=scanner.nextLine();
        System.out.println("Enter second word");
        String word2=scanner.nextLine();
        String result="";


   if(word1.charAt(word1.length()-1)==word2.charAt(0)){
        result = word1+word2.substring(1);

    }
        System.out.println(result);
   scanner.close();
}}

   /* Ask user to enter two words. Then add them together and print.
        But if the last letter if the first word and the first letter of the last letter is the same,
        print that character once.

        Input:
        one
        eight
        Output:
        oneight*/