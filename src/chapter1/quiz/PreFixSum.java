package chapter1.quiz;

public class PreFixSum {
    public static void main(String[] args) {
        int[] a = {2, 5, 8};
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.print("누적합: " + sum);


    }
}
