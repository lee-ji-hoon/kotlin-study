package javaToKotlin.chapter03.section02.java;

public interface JavaSwimable {
    default void act() {
        System.out.println("어푸어푸");
    }
}
