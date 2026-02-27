package chapter1.quiz;

public class GugudanAll {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++ ){
            System.out.println(i + "단");
            for (int o = 1; o <= 9; o++){
                System.out.println(i + "X" + o + "=" + (i * o));
            }
        }

    }
}
