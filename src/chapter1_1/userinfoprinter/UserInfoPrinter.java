package chapter1_1.userinfoprinter;

import java.util.Scanner;

public class UserInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이름입력
        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 나이입력
        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // 출력
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);



    }
}
