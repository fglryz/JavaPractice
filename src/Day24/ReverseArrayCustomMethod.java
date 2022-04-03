package Day24;

import java.util.Arrays;

public class ReverseArrayCustomMethod {
    public static void main(String[] args) {

    }
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }

}
