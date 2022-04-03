package Day11;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {



                 Scanner scanner = new Scanner(System.in);

                System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

                String a = scanner.nextLine();
                String result="";
                switch (a){
                    case "a":
                        result=("wrong");
                        break;
                    case" b":
                        result="correct";
                        break;
                    case "c":
                        result="wrong";
                        break;
                    default:
                        result="is not a valid answer";

                        System.out.println(result);
            }

}}
