package Day13;

import java.util.Scanner;

public class Ly {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scanner.next();
        String result="";
        String lastTwoChars = word.substring( word.length()-2 );

        if (lastTwoChars.equals("ly" )){
            result = "really???";
        }
        else{
            result="never mind";
    }
        System.out.println(result);
}}
/*
ask the user to enter a word. if the word ends with "ly", print "really???" ,
 otherwise, print "never mind"
 */