package Day14;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Wordly_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  word");
        String word=scanner.nextLine();

        String lastTwoChars=word.substring(word.length()-2);
        if(lastTwoChars.equals("ly")){
            System.out.println("realy");
        }
        else {
            System.out.println("never mind");
    }

}}
/*
ask the user
to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */