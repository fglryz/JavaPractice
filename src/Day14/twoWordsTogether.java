package Day14;

import java.util.Scanner;

public class twoWordsTogether {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=scanner.nextLine();
        System.out.println("Enter second word");
        String word2=scanner.nextLine();

        System.out.println(word1.substring(1)+word2.substring(1));

        scanner.close();

    }
}
