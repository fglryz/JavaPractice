package FunctioanalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
@FunctionalInterface
interface ArrayFunction<T,R>{
    R apply(T[] array);

public class T1_FunctionalInterface {
    public static void main(String[] args) {

        ArrayFunction<Integer,Integer> maxArr = arr -> {
            return   Collections.max(Arrays.stream(arr).collect(Collectors.toList()));
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(maxArr.apply(arr));

        System.out.println("-----------------------------------------");

        ArrayFunction<Integer,Integer> minArr = arr2 -> {
            return   Collections.min(Arrays.stream(arr2).collect(Collectors.toList()));
        };

        System.out.println(minArr.apply(arr));

        System.out.println("------------------------------------------");

        ArrayFunction<String,String> longestArr = s -> {
            String longestElement = "";
            for (String each : s) {
                if (each.length()>longestElement.length()){
                    longestElement = each;
                }
            }
            return longestElement;
        };

        String[] arr2 = {"Java","Python","Ruby","C++","C#"};

        System.out.println(longestArr.apply(arr2));

        System.out.println("---------------------------------------------");

        ArrayFunction<String,String> shortestArr = s -> {
            String shortestElement = s[0];
            for (String each : s) {
                if (each.length() < shortestElement.length()){
                    shortestElement = each;
                }
            }
            return shortestElement;
        };

        System.out.println(shortestArr.apply(arr2));
    }
}


}
/*
1. Create a functional interface named ListFunction that contains the following abstract method:

		R apply(List<T>  list);

	Use ListFunction functional interface to:
		1.1 Create a function that can return the maximum number from a list of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array


 */