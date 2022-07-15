package javaToKotlin.chapter02.section03;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Lec07Main {
    public static void main(String[] args) throws IOException {
        Lec07Main T = new Lec07Main();
        T.readFile();
    }

    // 1. try catch finally
    // 주어진 문자열을 정수로 변경하는 예제
    private int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.", str));
        }
    }

    // 주어진 문자열을 정수로 변경하는 예제 -> 실패하면 null 반환!
    private Integer parseIntOrNull(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    // 2. Checked Exception 과 Unchecked Exception
    public void readFile() throws IOException { // throws IOException 필수이다.
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsolutePath() + "/a.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader.readLine());
        reader.close();
    }

    // 3. try with resources
    public void readFile(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        }
    }
}
