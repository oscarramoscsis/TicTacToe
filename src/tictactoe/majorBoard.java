package tictactoe;

public class majorBoard {

    private innerBoard board1 = new innerBoard();
    private innerBoard board2 = new innerBoard();
    private innerBoard board3 = new innerBoard();
    private innerBoard board4 = new innerBoard();
    private innerBoard board5 = new innerBoard();
    private innerBoard board6 = new innerBoard();
    private innerBoard board7 = new innerBoard();
    private innerBoard board8 = new innerBoard();
    private innerBoard board9 = new innerBoard();

    private int[][] board = new int[3][3];

    innerBoard [][] majorBoardArray = { {board1, board2, board3},
            {board4, board5, board6},
            {board7, board8, board9}};


    public innerBoard[][] getMajorBoardArray() {
        return majorBoardArray;
    }

    public innerBoard getInnerBoard(int row, int column) {
        return majorBoardArray[row][column];

    }

    public boolean checkWin(){

        boolean returnVal = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = majorBoardArray[i][j].getWinnerID();
            }
        }

        //checks the rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0)
                returnVal = true;
        }

        //checks the columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0)
                returnVal = true;
        }

        //check for diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0 ){
            returnVal = true;
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != 0 ){
            returnVal = true;
        }

        return returnVal;
    }


    public int[][] getBoard() {
        return board;
    }

    @Override
    public String toString() {
        String returnVal = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String tempBoard = majorBoardArray[i][j].toString();
                returnVal += tempBoard;
                returnVal += "("+ (i+1) + ", " + (j+1) + ")";
                returnVal += "\n \n";

            }
            returnVal += "\n";
        }

        return returnVal;
    }
}
