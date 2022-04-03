package Day25;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] il={1,2,3,45};
     il=reverse(il);
        System.out.println(Arrays.toString(il));
    }
    public static int[] reverse(int[] array){
        int[] reverse=new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++]=array[i];
        }
        return reverse;
    }
}
