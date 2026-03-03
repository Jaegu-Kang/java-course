package chapter1.array;

public class Main {
    public static void main(String[] args) {
//        String name1 = "모험1";
//        String name2 = "모험2";
//        String name3 = "모험3";
//
//        String[] name = {"모험5", "모험5"};

        // 배열 선언과 길이 동시 할당
 //       int[] arr = new int[5];

        // 배열 선언과 동시 배열의 요소 할당

 //       int[] arr2 = {10,20,30,40,50};

        //배열의 길이
 //       int arrlenght = arr2.length;{
  //          System.out.println("배열의길이는:" + arrlenght);
 //       }
        //문자형 배열선언
        String[] str = new String[5];
        //논리형 배열선언
        Boolean[] bool = new Boolean[3];

        //배열의 요소에 접근: 인덱스 활용 방법
          int[] arr = {10, 20, 30, 40, 50};
//        System.out.println("배열의 1번째 요소는:" + arr[0]);
//        System.out.println("배열의 2번째 요소는:" + arr[1]);
//        System.out.println("배열의 3번째 요소는:" + arr[2]);
//        System.out.println("배열의 4번째 요소는:" + arr[3]);
//        System.out.println("배열의 5번째 요소는:" + arr[4]);

//        arr[0] = 100;
//       System.out.println("배열의 1번째 요소는:" + arr[0]);
        for (int i = 0; i <= arr.length; i++){
            System.out.println("인덱스" + i + "값은:" + arr[i]);
        }






    }
}
