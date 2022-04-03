package Day14;

import java.util.Scanner;

public class wordWithoutX {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scanner.next();

        System.out.println(word.substring(1));
    }
}
/*
Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */