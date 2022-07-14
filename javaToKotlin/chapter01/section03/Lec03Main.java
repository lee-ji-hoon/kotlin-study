package javaToKotlin.chapter01.section03;

import javaToKotlin.chapter01.Person;

public class Lec03Main {
    public static void main(String[] args) {
        int number1 = 4;
        long number2 = number1; // 타입이 다름에도 불구하고 long이 더 높기 때문에 형변환이 자동으로 이루어진다.
        System.out.println(number1 + number2);
    }

    public static void printAgeIfPerson(Object obj) {
        if (!(obj instanceof Person)) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}

