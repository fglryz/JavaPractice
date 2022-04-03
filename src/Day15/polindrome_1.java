package Day15;

public class polindrome_1 {

    public static void main(String[] args) {
        String word="level";
        String reversed="";

        for (int i = word.length()-1; i>=0 ; i--) {
            reversed+=word.charAt(i);


        }
        boolean isPolindrome=word.equalsIgnoreCase(reversed);
        System.out.println(isPolindrome);
    }
}
/*
Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */