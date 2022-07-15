package javaToKotlin.chapter03.section04.java;

public class JavaSingleton {
    private static final JavaSingleton INSTANCE = new JavaSingleton();

    private JavaSingleton() { }

    public static JavaSingleton getInstance() {
        return INSTANCE;
    }
}
