package Day8;

public class MaxNumber1 {
    public static void main(String[] args) {
        int n1=100;
        int n2=200;

        if(n1>n2){
            System.out.println(n1+" is bigger");
        }
        else if(n2>n1){
            System.out.println(n2+" is bigger");
        }
        else
        {
            System.out.println("Both are equal");
        }


    }
}
/*
3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
 */