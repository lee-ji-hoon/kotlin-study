package javaToKotlin.chapter03.section02.java;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable {
    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다.");
    }

    @Override
    public int getLegCount() {
        return super.legCount + this.wingCount;
    }

    @Override
    public void act() {
        JavaFlyable.super.act();
        JavaSwimable.super.act();
    }
}
