package FunctioanalInterface;

import java.util.*;

public class HigherFrequency2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("java", "java","python","c#"));

        Map<String,Integer> listMap = new LinkedHashMap<>();

        for (String each : list) {
            listMap.put(each, Collections.frequency(list,each));
        }

        System.out.println("listMap = " + listMap);

        int highestFreq = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : listMap.entrySet()) {
            if (entry.getValue()>highestFreq){
                highestFreq = entry.getValue();
            }

            if (entry.getValue().equals(highestFreq)){
                System.out.println("element "+entry.getKey()+" has the highest frequency");
            }
        }
    }

}
/*
Write a program that can find the element that has the highest frequency in an arrayList
            Note: Must use a map

            Ex:
                list: [java, java, python, c#]

            output:
                [java=2, python=1, c#=1]
                element java has the highest frequency

 */

