package tictactoe;

public class test {

    public static void main(String[] args) {
        majorBoard myMainBoard = new majorBoard();

        innerBoard workingBoard = myMainBoard.getInnerBoard(1, 1);

        workingBoard.print();

        System.out.println("this is a test");

        workingBoard.print();


    }
}
