package tictactoe;

public class majorBoard {

    innerBoard board1 = new innerBoard();
    innerBoard board2 = new innerBoard();
    innerBoard board3 = new innerBoard();
    innerBoard board4 = new innerBoard();
    innerBoard board5 = new innerBoard();
    innerBoard board6 = new innerBoard();
    innerBoard board7 = new innerBoard();
    innerBoard board8 = new innerBoard();
    innerBoard board9 = new innerBoard();

    innerBoard [][] majorBoardArray = { {board1, board2, board3},
            {board4, board5, board6},
            {board7, board8, board9}};

    public innerBoard[][] getMajorBoardArray() {
        return majorBoardArray;
    }

    public innerBoard getInnerBoard(int row, int column)
    {
        return majorBoardArray[row][column];

    }

}
