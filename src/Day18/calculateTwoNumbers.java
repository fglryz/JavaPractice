package Day18;

import java.util.Scanner;

public class calculateTwoNumbers {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number: ");
            int number = input.nextInt();

            System.out.println("Enter math operators(+ -* /)");
            char ch = input.next().charAt(0);
            while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.out.println("Invalid please re-entered");
                ch = input.next().charAt(0);
            }
            System.out.println("Enter second number: ");
            int number1 = input.nextInt();

            int result = 0;

            result = (ch == '+') ? number + number1 : (ch == '-') ? number - number1 : (ch == '*') ? number * number1 : number / number1;

            System.out.println(result);

            System.out.println("do you want to continue?:");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry,re=enter again");
                System.out.println("Would you like to another room?");
                answer = input.next().toLowerCase();

            }
            if (answer.equals("no")) {
                System.out.println("thanks for using Cydeo calculator ");
                break;
            }
        }

    }}







/*
Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-
,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry
 */