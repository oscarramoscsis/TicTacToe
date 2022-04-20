package tictactoe;

public class innerBoard {

    //fields
    private int[][] board = { {0,0,0},
            {0,0,0},
            {0,0,0} };

    //constructor
    public innerBoard() {

    }

    //methods

    public void print(){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }
}
