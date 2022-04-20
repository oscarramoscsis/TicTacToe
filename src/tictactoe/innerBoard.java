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
    public int[][] getBoard() {
        return board;
    }

    //for the symbol int, we can change it based on the turn counter
    public void updateBoard(int symbol, int xpos, int ypos){
            board[xpos][ypos] = symbol;
    }



    public boolean checkWin(){

        boolean returnVal = false;
        //000
        //000
        //000
        return returnVal;
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
