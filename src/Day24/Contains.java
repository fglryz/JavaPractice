package Day24;

public class Contains {


        public static boolean contains(int[] array, int element){

            boolean result = false;

            for (int each : array) {
                if(each == element){
                    result = true;
                }
            }

            return result;
        }

    }
/*
9. Create a method named contains that passes one integer array and one integer parameters,
the method returns true if the given integer is contained in the given array, otherwise returns false
 */


