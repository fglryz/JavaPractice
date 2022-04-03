package Day17;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number");
            int num2 = scanner.nextInt();

            System.out.println("Enter math opereator ( - + * /)");
            char ch = scanner.next().charAt(0);

            while (!(ch == '-' || ch == '+' || ch == '*' || ch == '/')) {
                System.out.println("Invalid operator,please re enter");
                ch = scanner.next().charAt(0);
            }
            int result = 0;
            switch (ch) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;

            }


        }
    }

/*
write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)

 */