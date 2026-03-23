package chapter1_1.operator;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 9;

        int sum = a + b;
        System.out.println("덧셈 결과: " + sum);

        int sub = a - b;
        System.out.println("뺄셈 결과: " + sub);

        int sub2 = a * b;
        System.out.println("곱셈 결과: " + sub2);

        int div = a / b;
        System.out.println("나눗셈 결과: " + div);

        int div2 = a % b;
        System.out.println("나머지 결과: " + div2);

        int x = 5;
        int y = 8;

        boolean a1 = x > y;
        boolean a2 = x < y;
        boolean a3 = x == y;
        boolean a4 = x != y;

        System.out.println("x가 y보다 큰가? " + a1);
        System.out.println("x가 y보다 작은가? " + a2);
        System.out.println("x와 y가 같은가? " + a3);
        System.out.println("x와 y가 다른가? " + a4);

        System.out.println("첫번째 문자열을 입력하세요: ");
        String str1 = scanner.nextLine();
        System.out.println("두번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();
        boolean bool1 = str1.equals(str2);
        System.out.println("두 문자열이 같은가요? " + bool1);


    }
}
