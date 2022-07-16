package javaToKotlin.chapter04.section01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15Main {
    public static void main(String[] args) {
        int[] array = {100, 200};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s $s", i, array[i]);
        }

        final List<Integer> numbers = Arrays.asList(100, 200);

        System.out.println(numbers.get(0));
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s %s", i, numbers.get(i));
        }

        Map<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "Monday");
        oldMap.put(2, "TUESDAY");

//        Map.of(1, "MONDAY", 2, "TUESDAY");

        for (int key : oldMap.keySet()) {
            System.out.println(key);
            System.out.println(oldMap.get(key));
        }
        for (Map.Entry<Integer, String> entry : oldMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
