package Day12;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.
        println("Enter name of products:");
        String name=input.nextLine();

        System.out.println("Enter price:");
        double price=input.nextDouble();

        System.out.println("Enter quantity:");
        int quantity=input.nextInt();
        System.out.println("Enter first name:");
        String fname= input.next();
        double totalPrice=quantity*price;

        System.out.println(fname+","+"you order for "+quantity+" "+name+" has been places. " +
                "Your total is "+totalPrice);

    }
}
/*
PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */