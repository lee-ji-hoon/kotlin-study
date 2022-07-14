package javaToKotlin.chapter01.section04;

import javaToKotlin.chapter01.Person;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney javaMoney1 = new JavaMoney(1_000L);
        JavaMoney javaMoney2 = javaMoney1;
        JavaMoney javaMoney3 = new JavaMoney(1_000L);

        System.out.println("javaMoney1==javaMoney2 = " + (javaMoney1 == javaMoney2)); // true
        System.out.println("javaMoney1==javaMoney3 = " + (javaMoney1 == javaMoney3)); // false

        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(3_000L);
        System.out.println("money1.plus(money2) = " + money1.plus(money2)); // money1.plus(money2) = JavaMoney{amount=4000}
    }
}

