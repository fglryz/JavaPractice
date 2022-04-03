package Day24;

public class MinNumberCustomMethod {
    public static void main(String[] args) {
        double[] number = {1, 3, 76, 87, 45, 67};


    }
    public static double min(double[] number) {
        double result = 0;
        for (int i = 0; i < number.length; i++) {
            if (result > number[i]) {
                result = number[i];
            }
        }
            return result;
        }
    }








