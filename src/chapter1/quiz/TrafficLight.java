package chapter1.quiz;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        String light = scanner.nextLine();

        switch (light) {

            case "초록불":
                System.out.println("초록불 건너세요");
                break;


            case "노란불":
                System.out.println("노란불 주의하세요");
                break;

            case "빨간불":
                System.out.println("빨간불 멈추세요!");
                break;

            default:
                System.out.println("잘못된 입력입니다!");


        }
    }
}
