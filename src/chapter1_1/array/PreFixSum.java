package chapter1_1.array;

public class PreFixSum {

    public static void main(String[] args) {

        int[] arr = {2, 5, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("누적합 = " + sum);
    }
}
