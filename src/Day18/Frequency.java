package Day18;

public class Frequency {
    public static void main(String[] args) {
        String str = "aabccd";
        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

            if(count==1){//if the frequency of the character is 1 ,then the character unique
                result+=ch;
            }
        }
        System.out.println(result);
    }
    }
/*
Write a program that can find the frequency of the characters from a
string
 Ex:
str = "aabcccd";
output:
a2b1c3d1
Hint: if you find out how to find the frequency of one
character, then repeat it for all the remaining characters
 */