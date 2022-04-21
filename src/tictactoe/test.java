package tictactoe;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {









//        majorBoard myMainBoard = new majorBoard();
//        innerBoard workingBoard = myMainBoard.getInnerBoard(1, 1);
//
//        boolean gameIsWon = false;
//        boolean moveValid;
//        int counter = 1;
//        int turnId;
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name! ");
//        String name = input.next();
//        Player player1 = new Player(name, 1);
//        System.out.println("Hello "+name+"! ");
//        System.out.println("PLayer 2 enter your name! ");
//        name = input.next();
//        Player player2 = new Player(name, 2);
//        System.out.println("Hello "+name+"! ");
//
//        int xCord;
//        int yCord;
//
//        while(gameIsWon != true) {
//
//            if (counter % 2 == 0){
//                turnId = 2;
//                System.out.print(player2.getName()+ ", please ");
//            } else {
//                turnId = 1;
//                System.out.print(player1.getName() + ", please ");
//            }
//
//
//            System.out.println("make a move:");
//            xCord = input.nextInt() - 1;
//            yCord = input.nextInt() - 1;
//
//            if (workingBoard.checkValid(xCord, yCord)) {
//                workingBoard.updateBoard(turnId, xCord, yCord);
//                System.out.println(workingBoard);
//                gameIsWon = workingBoard.checkWin();
//            } else
//                System.out.println("Invalid, try again!");
//
//            counter ++;
//        }
//
//        if (counter % 2 == 0){
//            turnId = 2;
//            System.out.println(player1.getName() + " wins!");
//            player1.playerWin();
//        } else {
//            turnId = 1;
//            System.out.println(player2.getName() + " wins!");
//            player2.playerWin();
//        }
//
//        System.out.println(myMainBoard);
    }
}
