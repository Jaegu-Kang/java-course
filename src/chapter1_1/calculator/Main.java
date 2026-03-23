package chapter1_1.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("첫번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("사칙연산 기호를 입력하세요: ");
        String c = sc.nextLine();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        if (c.equals("+")){
            System.out.println("결과 = " + sum);
        } else if (c.equals("-")) {
            System.out.println("결과 = " + sub);
        } else if (c.equals("*")) {
            System.out.println("결과 = " + mul);
        } else if (c.equals("/")) {
            System.out.println("결과 = " + div);
        }


    }
}
