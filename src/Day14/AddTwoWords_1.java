package Day14;

import java.util.Scanner;

public class AddTwoWords_1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=scanner.nextLine();
        System.out.println("Enter second word");
        String word2=scanner.nextLine();

        System.out.println(word1.substring(1)+word2.substring(1));

    }
}
/*1. Ask user to enter two words. Print first word without its first
        character
        then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana*/