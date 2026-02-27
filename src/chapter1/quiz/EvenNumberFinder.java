package chapter1.quiz;

public class EvenNumberFinder {
    public static void main(String[] args) {

        int[] a = {3, 4, 7, 10, 20};
        System.out.println("짝수: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }

        }
    }
}
