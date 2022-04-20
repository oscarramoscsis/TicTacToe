package tictactoe;

public class test {

    public static void main(String[] args) {
        majorBoard myMainBoard = new majorBoard();

        innerBoard workingBoard = myMainBoard.getInnerBoard(1, 1);

        System.out.println(workingBoard);

        workingBoard.updateBoard(2, 1, 1);

        System.out.println(workingBoard);






    }
}
