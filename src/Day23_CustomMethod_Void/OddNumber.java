package Day23_CustomMethod_Void;

public class OddNumber {
    public static void main(String[] args) {
        oddNumber();
        System.out.println();

    }

    public static void oddNumber() {

        for (int i = 1; i <= 100; i +=2) {
            System.out.print(" "+i);
        }
    }

}


