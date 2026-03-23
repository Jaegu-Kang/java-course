package chapter1_1.array;

public class EvenNumberFinder {

    public static void main(String[] args) {

        int[] arr = {3, 4, 7, 10, 20};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.println("짝수는: " + arr[i]);
            }
        }
    }
}
