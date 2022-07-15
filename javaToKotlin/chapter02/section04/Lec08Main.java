package javaToKotlin.chapter02.section04;

public class Lec08Main {
    // 1. 함수 선언 방법
    public int max(int a, int b) {
        if(a > b)
            return a;
        return b;
    }

    // 2. default parameter
    public static void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine)
                System.out.println(str);
            else
                System.out.println(str);
        }
    }

    // 4. 같은 타입의 여러 파라미터 받기
    // 문자열을 N개 받아 출력하는 예제
    public static void printAll(String... String) {
        for (java.lang.String str : String) {
            System.out.println(str);
        }
    }
}
