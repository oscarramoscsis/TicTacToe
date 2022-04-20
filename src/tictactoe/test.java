package tictactoe;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        majorBoard myMainBoard = new majorBoard();
        innerBoard workingBoard = myMainBoard.getInnerBoard(1, 1);

        boolean gameIsWon = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name!");
        String name = input.next();
        Player player1 = new Player(name, 1);
        System.out.println("Hello "+name+"!");
        System.out.println("PLayer 2 enter your name!");
        name = input.next();
        Player player2 = new Player(name, 2);
        System.out.println("Hello "+name+"!");
        System.out.println("make a move:");
        int xCord;
        xCord = input.nextInt() - 1;
        int yCord;
        yCord = input.nextInt() - 1;

        workingBoard.updateBoard(1,xCord,yCord);

        System.out.println(workingBoard);




    }
}
