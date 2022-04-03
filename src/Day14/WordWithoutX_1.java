package Day14;

import java.util.Scanner;

public class WordWithoutX_1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  word start with x");
        String word=scanner.nextLine();

        String word1=word.substring(1);
        System.out.println(word1);
    }
}

/*
Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */