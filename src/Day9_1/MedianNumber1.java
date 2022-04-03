package Day9_1;

public class MedianNumber1 {
    public static void main(String[] args) {
        int n1=12;
        int n2=15;
        int n3=11;

        if(n2>n1&&n2<n3||n2>n3&&n2<n1){
            System.out.println("n2 is median");

        }
        else if( n1>n2&&n1<n3||n1>n3&&n1<n2){
            System.out.println("n1 is median");
        }
        else{
            System.out.println("n3 is median");
        }

    }
}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */