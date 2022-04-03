package Day15;

public class reverse_1 {
    public static void main(String[] args) {

        String str="Wooden Spoon";
        String reversed="";
        for (int i=str.length()-1;i>=0;i--) {

           reversed+=""+str.charAt(i);

        }
        System.out.println("reversed = " + reversed);
    }
}
/*
Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW

 */