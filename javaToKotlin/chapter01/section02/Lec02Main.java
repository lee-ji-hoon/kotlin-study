package javaToKotlin.chapter01.section02;

public class Lec02Main {
    public static void main(String[] args) {

    }
    public Boolean startWithA1(String str) {
        if(str == null)
            throw new IllegalArgumentException("null이 들어왔습니다.");
        return str.startsWith("A");
    }

    public Boolean startsWithA2(String str){
        if (str == null)
            return null;
        return str.startsWith("A");
    }

    public boolean startsWithA3(String str){
        if (str == null)
            return false;
        return str.startsWith("A");
    }
}

