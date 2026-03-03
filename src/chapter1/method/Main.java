package chapter1.method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();

        //2. 매서드(함수)를 호출
       int result = calculator.sum(1, 2);
        System.out.println("결과는: " + result);
    }
}
