package Day14;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your account number");
        String account=scanner.next();
        scanner.close();
        String result="Invalid";

        if(account.charAt(0)=='2'){
            if(account.length()==7){
                result="Valid";
            }
            else if(account.charAt(0)=='5'){
                if(account.length()==10){
                    result="Valid";
                }
            }
        }
        System.out.println(result);
    }
}
    /*7. Create a class called AccountNumber.
        Ask the user enter an account number (String). Check if these
        account number is valid.
        > If the account number begins with a â2â the account
        number should be 7 characters long
        > If the account number begins with a â5â the account
        number should be 10 characters long
        â> If the account number does not begin with a 2 or a 5 OR
        the account number lengths
        do not meet the expected results print âInvalid
        account numberâ*/