package chapter1.quiz;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 구구단 단수를 입력하세요 (2~9): ");
        int a = scanner.nextInt();

        if (a < 2 || a > 9 ){
        }
        else {
            System.out.println(a + "단");
            for (int i = 1; i <= 9; i++){
                System.out.println(a + "X" + i + "=" + (a * i));
            }
        }


    }
}
