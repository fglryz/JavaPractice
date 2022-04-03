package Day20;

public class Task1InitialsClassMates {
    public static void main(String[] args) {
        String[] classmates= {"Kerim Guleryuz","Niz Guleryuz","Fat Guleryuz","Metin Guleryuz",
                "Rana keskin","Altun keskin","Afet Keskin","Hami keskin","Ahmet Keskin","Kubra Kiratli"};

        for (String each : classmates) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));

        }
    }
}
/*
1. create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */