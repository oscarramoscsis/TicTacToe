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

    @Override
    public String toString(){
        String returnVal = "";

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                //System.out.print(board[i][j]);
                returnVal += board[i][j];
            }
            //System.out.println();
            returnVal += "\n";
        }

        return returnVal;

    }

    public int[][] getBoard() {
        return board;
    }

    public void updateBoard(int symbol, int xpos, int ypos){

        board[xpos][ypos] = symbol;

    }

}
