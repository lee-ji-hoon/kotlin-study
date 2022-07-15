package javaToKotlin.chapter03.section02.java;

public class JavaCat extends JavaAnimal{
    public JavaCat(String species) {
        super(species, 4);
    }
    @Override
    public void move() {
        System.out.println("고양이가 움직인다.");
    }
}
