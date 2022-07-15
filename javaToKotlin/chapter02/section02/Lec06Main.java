package javaToKotlin.chapter02.section02;

import java.util.Arrays;
import java.util.List;

public class Lec06Main {
    public static void main(String[] args) {
        // 1. for-each
        List<Long> longList = Arrays.asList(1L, 2L, 3L);
        for (Long number : longList)
            System.out.println(number);
        // 2. 전통적이 for문
        for (int i = 1; i <= 5; i+=2)
            System.out.println(i);
    }
}
