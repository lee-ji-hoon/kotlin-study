package javaToKotlin.chapter03.section02.java;

public interface JavaFlyable {
    default void act() {
        System.out.println("파닥파닥");
    }

//    void fly();
}
