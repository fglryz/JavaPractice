package Day15;

public class somOfDigits {
    public static void main(String[] args) {

        String str="A1B2C3";
        String digits="123";

;        char ch;
       int sum=0;
        for (int i = 0; i < str.length();i++) {
            ch=str.charAt(i);
            if (ch>='0'&&ch<='9'){
                 sum+=ch-48;
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("sum = " + sum);
    }
}
/*
Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */