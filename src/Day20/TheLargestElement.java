package Day20;

public class TheLargestElement {
    public static void main(String[] args) {
        int [] array1={0,5,7,9,1,3};
        int largest=array1[0];
        for (int i = 0; i <array1.length ; i++) {
            if(array1[i]>largest){
                largest=array1[i];
            }

        }
        System.out.println(largest);


    }
}
