package Day20;

public class FrequentElements {
    public static void main(String[] args) {
        int[] array={0,1,2,3,1,2,0,1};
        int count2=0;
        int mostFreqNumber=0;
        for (int i = 0; i < array.length ; i++) {
            int count=0;
            for (int j = 0; j < array.length ; j++) {
                if(array[i]==array[j]){
                    count++;
                }
                if(count>count2){
                    count2=count;
                    mostFreqNumber=array[i];
                }

            }
            System.out.println(mostFreqNumber);

        }
    }
}
