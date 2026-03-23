package chapter1_1.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 출력
        // 줄바꿈
        System.out.println("Hello");
        System.out.println("Java");

        // 줄바꿈없음
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 출력
        System.out.print("Hello\nWorld\n");

        // 입력
        // 스캐너 객체를 스캐너형 박스에 넣은것
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        System.out.println("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        // 정수형(int, long) 입력받기
        System.out.println("정수(int)를 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.println("정수(long)를 입력하세요: ");
        long longBox = scanner.nextLong();
        System.out.println("longBox = " + longBox);

        // 소수점
        System.out.println("소수점(double)을 입력하세요: ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);

        



    }
}