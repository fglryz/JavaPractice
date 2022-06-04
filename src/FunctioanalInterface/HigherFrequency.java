package FunctioanalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HigherFrequency {
    public static void main(String[] args) {

        String str="eeeeeaaabbbccdd";
        String[] arr=str.split("");
        Map<String,Integer> map=new LinkedHashMap<>();
        for (String each : arr) {
            map.put(each, Collections.frequency(Arrays.asList(arr),each));

        }
        int highestFreq=Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>highestFreq){
                highestFreq=entry.getValue();
        }

                if (entry.getValue().equals(highestFreq)){
                    System.out.println("character "+ entry.getKey() +" has the highest frequency");
                }

        }

    }
}
