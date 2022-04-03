package Day14;

import java.util.Scanner;

public class wordLy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    System.out.println("enter a word");
        String word=scanner.next();

        String lastTwoChars=word.substring(word.length()-2);
        if (lastTwoChars.equals("ly")){
            System.out.println("really???");
        }
        else{
            System.out.println("never mind");
        }
}}
/*
ask the user
to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */