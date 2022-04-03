package Day20;

public class Task2SeperateLineReversed {
    public static void main(String[] args) {

        String[] names={"java","python","c#"};


        for (String each : names) {

            String reserved=" ";


           for (int i = each.length() - 1; i >= 0; i--) {
               reserved+=each.charAt(i);


        }
            System.out.println(reserved);
        }

        }}






/*
2. create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
 */