package tictactoe;

import GUItest.GUItest;

import java.awt.*;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUItest frame = new GUItest();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

////        majorBoard mainBoard = new majorBoard();
//        Scanner input = new Scanner(System.in);
//        boolean innerGameIsWon = false;
//        boolean outterGameIsWon = false;
//
////        innerBoard workingBoard = new innerBoard();
////        int counter = 1;
//        int turnId = 1;
//
//        int xCord;
//        int yCord;


//        GUItest myGui = new GUItest();
//        myGui.setVisible(true);

//        //Creates both players
//        System.out.println("Enter your name! ");
//        String name = input.next();
//        Player player1 = new Player(name, 1);
//        System.out.println("Hello "+name+"! ");
//        System.out.println("Player 2 enter your name! ");
//        name = input.next();
//        Player player2 = new Player(name, 2);
//        System.out.println("Hello "+name+"! ");
//
//        //prints main board
//        System.out.println(guiController.mainBoard);
//
//        System.out.println(player1.getName() + ", where would you like to start?");
//        System.out.println("make a move:");
//        xCord = input.nextInt() - 1;
//        yCord = input.nextInt() - 1;
//
//        guiController.workingBoard = guiController.mainBoard.getInnerBoard(xCord,yCord);
//        System.out.println(guiController.workingBoard);
//
//        System.out.println("make a move:");
//        xCord = input.nextInt() - 1;
//        yCord = input.nextInt() - 1;
//
//        guiController.workingBoard.updateBoard(turnId, xCord, yCord);
//        innerGameIsWon = guiController.workingBoard.checkWin();
//        System.out.println(guiController.mainBoard);
//        guiController.workingBoard = guiController.mainBoard.getInnerBoard(xCord, yCord);
//        guiController.counter++;
//
//        while(outterGameIsWon != true) {
//            while (innerGameIsWon != true) {
//
//                System.out.println(guiController.workingBoard);
//                System.out.printf("(%d, %d) %n", (xCord+1), (yCord+1));
//
//
//                if (guiController.counter % 2 == 0) {
//                    turnId = 2;
//                    guiController.playerTurn = 2;
//                    System.out.print(player2.getName() + ", please ");
//                } else {
//                    turnId = 1;
//                    guiController.playerTurn = 1;
//                    System.out.print(player1.getName() + ", please ");
//                }
//
//                System.out.println("make a move:");
//                xCord = input.nextInt() - 1;
//                yCord = input.nextInt() - 1;
//
//                if (guiController.workingBoard.checkValid(xCord, yCord)) {
//                    guiController.workingBoard.updateBoard(turnId, xCord, yCord);
//                    System.out.println(guiController.workingBoard);
//                    innerGameIsWon = guiController.workingBoard.checkWin();
//                } else {
//                    while(guiController.workingBoard.checkValid(xCord,yCord) != true) {
//                        System.out.println("Invalid, try again!");
//                        System.out.println("make a move:");
//                        xCord = input.nextInt() - 1;
//                        yCord = input.nextInt() - 1;
//                    }
//                    guiController.workingBoard.updateBoard(turnId, xCord, yCord);
//                    System.out.println(guiController.workingBoard);
//                    innerGameIsWon = guiController.workingBoard.checkWin();
//                }
//                guiController.counter++;
//                System.out.println(guiController.mainBoard);
//                guiController.workingBoard = guiController.mainBoard.getInnerBoard(xCord, yCord);
//            }
//
//            if (guiController.counter % 2 == 0) {
//                turnId = 2;
//                System.out.println(player1.getName() + " wins the board!");
//                player1.playerWin();
//                guiController.workingBoard.setWinnerID(turnId);
//                innerGameIsWon = false;
//            } else {
//                turnId = 1;
//                System.out.println(player2.getName() + " wins the board!");
//                player2.playerWin();
//                guiController.workingBoard.setWinnerID(turnId);
//                innerGameIsWon = false;
//            }
//            outterGameIsWon = guiController.mainBoard.checkWin();
//        }
//        System.out.println("game over");
    }
}
