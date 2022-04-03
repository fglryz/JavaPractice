package Day12;

import java.util.Scanner;

public class PeopleLive {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many people live in there?:");
        int num=input.nextInt();
        String result="";

        result=num<3?"Live with less than 3 people":num>2&&num<=6?"Live with 3 - 6 people"
                :num>6?"Live with \"more than 6 people\"":"invalid";
        System.out.println(result);


    }


}
/*
 Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */