package Day9_1;

public class CharacterIdentity1 {
    public static void main(String[] args) {

        char ch='&';
        if(ch>=48 &&ch<=57){
            System.out.println("Digit");

        }
        else if(ch>=65 &&ch<=90 || ch>=97 &&ch<=122){
            System.out.println("Alphabetic Character");

        }

        else{
            System.out.println("Special Characters");
        }

    }}


/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */
