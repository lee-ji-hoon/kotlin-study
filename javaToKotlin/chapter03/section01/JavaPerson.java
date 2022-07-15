package javaToKotlin.chapter03.section01;

// 1. 클래스와 프로퍼티
public class JavaPerson {
    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        // 2. 생성자와 init
        if(age <= 0) {
            throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다.", age));
        }
        this.name = name;
        this.age = age;
    }

    // 최초로 태어나는 아기는 무조건 1살이니, 생성자를 하나 더 만들자!
    public JavaPerson(String name){
        this(name, 1);
    }

    // 3. 커스텀 getter setter
    public boolean isAdult() {
        return this.age >= 20;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
