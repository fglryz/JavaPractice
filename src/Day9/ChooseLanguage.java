package Day9;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write a number between 1 and 5:");
        num= scan.nextInt();

        if (num==1)
        {
            System.out.println("Hello, thank for your call");
        }
        else if(num==2)
        {
            System.out.println("Hola, gracias para llamar");
        }else if (num==3)
        {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if (num==4)
        {
            System.out.println("Privet, spasibo za vash zvonok");
        }

    else if (num==5)
    {
        System.out.println("Merci ,pour votre appel");
    }
    else{
            System.out.println("Invalid operation");
        }


    }
}
