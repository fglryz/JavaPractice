package Day13;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        scan.close();

        char f = firstName.toUpperCase().charAt(0);
        char l = lastName.toUpperCase().charAt(0);

        String result = f+"."+l;

        System.out.println(result);


    }

}
/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */