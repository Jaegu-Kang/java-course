package chapter1_1.loop;

public class GugudanAll {

    public static void main(String[] args) {

        for (int num = 2; num <= 9; num++) {

            for (int i = 1; i <= 9; i++){
                System.out.println(num + "x" + i + "=" +(num * i) );
            }
        }
    }
}
