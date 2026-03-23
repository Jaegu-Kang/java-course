package chapter1_1.array;

public class BlackStoneFinder {

    public static void main(String[] args) {

        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int i = 0; i < board.length; i++){
            for (int o = 0; o < board[i].length; o++){
                if (board[i][o]){
                    System.out.println("검은돌 위치 = " + i + o);
                }
            }
        }
    }
}
