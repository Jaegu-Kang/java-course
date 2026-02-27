package chapter1.io;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //출력
        //println 사용
        System.out.println("Hello");
        System.out.println("Java");

        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        // 개행문자 포함 출력
        System.out.println("Hello\nWorld!");

        //입력(Scanner)
        //Scanner 객체를 scenner형 박스에
        Scanner scanner = new Scanner(System.in);

        //문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        //정수형(int, long) 입력받기
        System.out.print("정수를(int) 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수를(long) 입력하세요: ");
        long longbox = scanner.nextLong();
        System.out.println("longbox = " + longbox);

        //소수점
        System.out.println("소수점을(float) 입력하세요: ");
        float floatbox = scanner.nextFloat();
        System.out.println("floatbox = " + floatbox);





        // 정수형 데이터를 정수형 박스에 (a)
        int a = 1;


    }
}
