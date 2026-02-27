package chapter1.array;

public class main {
    public static void main(String[] args) {

//        // 모험가 명단을 관리하는법: 100, 1000, 10000
//        String name = "순살1";
//        String name = "순살2";
//        // ....
//
//        String[] userName = {"순살1", "순살2", "순살3"};

        //1. 배열 선언
 //       int[] arr;

        //2. 배열 길이 할당
 //       arr = new int[5];
        // arr = [] [] [] [] []

        //3. 배열 선언과 길이 동시에 할당
 //       int[] arr = new int[5];
        // arr = [] [] [] [] [] <- 빈공간

        //4. 배열 선언과 동시에 배열의 요소 할당
//         int[] arr = {10, 20, 30, 40, 50};
        // arr = [10] [20] [30] [40] [50]

        // 배열의 길이
//        int arrlength = arr.length;
//        System.out.println("arrlenght= " + arrlength);

        //문자열 배열 선언
//        String[] strarr = new String[5];

        //논리형 배열 선언
//        Boolean[] brarr = new Boolean[3]; //[true] [false] []

        //인덱스 활용방법 : 배열의 요소에 접근
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("배열의 1번째 요소 접근 = " + arr[0]);
        System.out.println("배열의 2번째 요소 접근 = " + arr[1]);
        System.out.println("배열의 3번째 요소 접근 = " + arr[2]);
        System.out.println("배열의 4번째 요소 접근 = " + arr[3]);
        System.out.println("배열의 5번째 요소 접근 = " + arr[4]);

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        System.out.println("배열의 1번째 요소 접근 = " + arr[0]);
        System.out.println("배열의 2번째 요소 접근 = " + arr[1]);
        System.out.println("배열의 3번째 요소 접근 = " + arr[2]);
        System.out.println("배열의 4번째 요소 접근 = " + arr[3]);
        System.out.println("배열의 5번째 요소 접근 = " + arr[4]);

        //배열 탐색
        for (int i = 0; i < arr.length; i++){
            System.out.println("인덱스"+ i + "의 값은= " + arr[i] );
        }

        //향상된 for문
        // arr [100] [200] [300] [400] [500]
        for (int a : arr){
            System.out.println("값" + a);
        }

  //      boolean[][] board = new boolean[2][2];
        boolean[][] board = {
                {true, false},
                {false, true}
        };
        System.out.println(board[0][0]);
        System.out.println(board[0][1]);








    }
}
