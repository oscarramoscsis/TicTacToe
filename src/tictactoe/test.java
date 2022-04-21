package tictactoe;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        majorBoard mainBoard = new majorBoard();
        Scanner input = new Scanner(System.in);
        boolean innerGameIsWon = false;
        boolean outterGameIsWon = false;

        innerBoard workingBoard = new innerBoard();
        int counter = 1;
        int turnId = 1;

        int xCord;
        int yCord;

        //Creates both players
        System.out.println("Enter your name! ");
        String name = input.next();
        Player player1 = new Player(name, 1);
        System.out.println("Hello "+name+"! ");
        System.out.println("Player 2 enter your name! ");
        name = input.next();
        Player player2 = new Player(name, 2);
        System.out.println("Hello "+name+"! ");

        //prints main board
        System.out.println(mainBoard);

        System.out.println(player1.getName() + ", where would you like to start?");
        System.out.println("make a move:");
        xCord = input.nextInt() - 1;
        yCord = input.nextInt() - 1;

        workingBoard = mainBoard.getInnerBoard(xCord,yCord);
        System.out.println(workingBoard);

        System.out.println("make a move:");
        xCord = input.nextInt() - 1;
        yCord = input.nextInt() - 1;

        workingBoard.updateBoard(turnId, xCord, yCord);
        System.out.println(workingBoard);
        innerGameIsWon = workingBoard.checkWin();
        System.out.println(mainBoard);
        workingBoard = mainBoard.getInnerBoard(xCord, yCord);

        counter++;

        while(outterGameIsWon != true) {
            while (innerGameIsWon != true) {
                System.out.println(workingBoard);

                if (counter % 2 == 0) {
                    turnId = 2;
                    System.out.print(player2.getName() + ", please ");
                } else {
                    turnId = 1;
                    System.out.print(player1.getName() + ", please ");
                }

                System.out.println("make a move:");
                xCord = input.nextInt() - 1;
                yCord = input.nextInt() - 1;

                if (workingBoard.checkValid(xCord, yCord)) {
                    workingBoard.updateBoard(turnId, xCord, yCord);
                    System.out.println(workingBoard);
                    innerGameIsWon = workingBoard.checkWin();
                } else
                    System.out.println("Invalid, try again!");

                counter++;
                System.out.println(mainBoard);
            }

            if (counter % 2 == 0) {
                turnId = 2;
                System.out.println(player1.getName() + " wins!");
                player1.playerWin();
                workingBoard.setWinnerID(turnId);
            } else {
                turnId = 1;
                System.out.println(player2.getName() + " wins!");
                player2.playerWin();
                workingBoard.setWinnerID(turnId);
            }

            outterGameIsWon = mainBoard.checkWin();
        }
    }
}
