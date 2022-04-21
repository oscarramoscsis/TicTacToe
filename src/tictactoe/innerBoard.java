package tictactoe;

public class innerBoard {

    //fields
    private int[][] board = { {0,0,0},
            {0,0,0},
            {0,0,0} };

        //tells you who has won the board.
    private int winnerID = 0;

    //constructor
    public innerBoard() {

    }

    //methods
    public int[][] getBoard() {
        return board;
    }

    //for the symbol int, we can change it based on the turn counter
    public void updateBoard(int symbol, int xpos, int ypos){
        board[xpos][ypos] = symbol;
    }

    //checks if the position is valid before updating the board
    public boolean checkValid(int xpos, int ypos){
        if (board[xpos][ypos] == 0){
            return true;
        } else
            return false;

    }



    public boolean checkWin(){

        boolean returnVal = false;
        //000
        //000
        //000

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

    //resets the board
    public void resetBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }

    }

    public int getWinnerID() {
        return winnerID;
    }

    public void setWinnerID(int winnerID) {
        this.winnerID = winnerID;
    }

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
}
