package Day24;

public class ArrayMaxNumberCustomMethod {
    public static void main(String[] args) {
     double[] arr={1,3,6,8,90,55,700};





    }

    public static double max(double[] arr) {
        double result =0;
        for (int i = 0; i < arr.length; ++i) {
            if (result < arr[i])
                result = arr[i];
        }
        return result;


    }



}