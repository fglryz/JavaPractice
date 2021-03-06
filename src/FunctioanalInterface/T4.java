package FunctioanalInterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class T4 {
    //4.1
        static Function<String, Integer> sumOfDigits = str -> str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();


        // 4.2   (Most elegant way: ArrayList::new)
        static Function<Set<Integer>, List<Integer>> setToListIntegers = set -> new ArrayList<>(set);

        // 4.3
        static Function<Set<String>, List<String>> setToListStrings = set -> new ArrayList<>(set);

        // 4.4
        static Function<int[], int[]> reverseIntArray = arr -> {
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = (arr[i] + arr[arr.length - i - 1]) - (arr[arr.length - i - 1] = arr[i]);
            }
            return arr;
        };

        // 4.5
        static Function<String[], String[]> reverseStringArray = arr -> {
            String temp;
            for (int i = 0; i < arr.length / 2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
            return arr;
        };

        // 4.6
        static Function<int[], int[]> descendingSortedIntArray = arr ->
                reverseIntArray.apply(Arrays.stream(arr)
                        .sorted()
                        .toArray());

        // 4.7
        static Function<String[], String[]> descendingSortedStringArray = arr ->
                Arrays.stream(arr)
                        .sorted(Comparator.comparing(String::valueOf).reversed())
                        .collect(Collectors.toList())
                        .toArray(new String[0]);


        public static void main(String[] args) {

            System.out.println("Sum of digits of \"7kjdsh8dsf9ds\" = " + sumOfDigits.apply("7kjdsh8dsf9ds"));

            List<Integer> integers = setToListIntegers.apply(new HashSet<>(Set.of(1, 2, 3, 5, 4)));
            System.out.println("List of integers from a set: " + integers);

            List<String> strings = setToListStrings.apply(new HashSet<>(Set.of("Burak", "Levent", "Kerem")));
            System.out.println("List of strings from a set: " + strings);

            int[] arr = {1, 2, 3, 4};
            System.out.println("Reversed int array: " + Arrays.toString(reverseIntArray.apply(arr)));

            String[] strArray = {"Burak", "Levent", "Kerem", "Osman", "Mert"};
            System.out.println("Reversed string array: " + Arrays.toString(reverseStringArray.apply(strArray)));

            System.out.println("Array \"arr\" in descending order: "
                    + Arrays.toString(descendingSortedIntArray.apply(arr)));

            System.out.println("Array \"strArray\" in descending order: "
                    + Arrays.toString(descendingSortedStringArray.apply(strArray)));
        }
    }





/*
4. Use Function functional interface to:
		4.1 Create a function that can return the sum of digits from a string

		4.2 Create a function that can convert a Set of Integers to List of Integers

		4.3 Create a function that can convert a Set of String to List of String

		4.4 Create a function that can return the reversed version of an int array

		4.5 Create a function that can return the reversed version of a String array

		4.6 Create a function that can return the sorted (decending) version of an int array
				Note: you can use the reverse function you created at 4.4

		4.7 Create a function that can return the sorted (decending) version of a String array
				Note: you can use the reverse function you created at 4.5


 */