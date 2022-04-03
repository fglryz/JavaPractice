package Day14;

import java.util.Scanner;

public class DigitUpper_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  word");
        String word = scanner.nextLine();
        char firstchar = word.charAt(0);

        if (firstchar >= '0' && firstchar <= '9'){
            System.out.println("digit");
        }
        else if (firstchar >= 'A' && firstchar <= 'Z') {
            System.out.println("first character is uppercase letter");

        }
    else if (firstchar >= 'a' && firstchar <= 'z') {
            System.out.println("first character is lowercase letter");
        }
else{
            System.out.println("special");
        }
    }}


/*
Ask user to enter a word,
        if the word starts with digits, print firstchar>='0'&&firstchar>='9'
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print firstchar>='0'&&firstchar>='9'
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */