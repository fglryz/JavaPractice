package Day19;

import java.util.Scanner;

public class uniqueCharacter {
    public static void main(String[] args) {
        String str="onceuponatime";
        int maxCount=0;
        String result="";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; //

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(ch == each) {
                    count++;
                }
            }
            if(maxCount<count) {
                maxCount = count;
                result=""+ch;
            }
        }
        System.out.println("The Character '" +result+ "'has highest frequency (" +maxCount+")from a string.");


        }}
/*
6.  Write a program that can find the character that has the highest frequency from a string



 */



