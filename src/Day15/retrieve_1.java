package Day15;

import java.util.Scanner;

public class retrieve_1 {
    public static void main(String[] args) {

        String mail="mn@#123Ab!";
        String letter="";
        String digits="";
        String special="";
        char ch;

        for (int i = 0; i < mail.length() ; i++) {
                 ch=mail.charAt(i);

                  if(ch >='A' && ch<='Z' || ch >='a' &&ch<= 'z'){
                letter+=mail.charAt(i);

            }

                  else if (ch >= '0' && ch <= '9'){
                      digits += mail.charAt(i);

        }

            else{
                special+=mail.charAt(i);
            }

        }

        System.out.println("special = " + special);
        System.out.println("letter = " + letter);;
        System.out.println("digits = " + digits);

    }
}
/*
write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */